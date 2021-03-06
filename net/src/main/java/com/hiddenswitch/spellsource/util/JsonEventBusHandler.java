package com.hiddenswitch.spellsource.util;

import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.fibers.Suspendable;
import co.paralleluniverse.strands.SuspendableAction1;
import com.hiddenswitch.spellsource.concurrent.SuspendableFunction;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.JsonObject;

class JsonEventBusHandler<T, R> implements SuspendableAction1<Message<JsonObject>> {
	private final SuspendableFunction<T, R> method;
	private final Class<? extends T> requestClass;

	JsonEventBusHandler(SuspendableFunction<T, R> method, Class<? extends T> requestClass) {
		this.method = method;
		this.requestClass = requestClass;
	}

	@Override
	@Suspendable
	public void call(Message<JsonObject> message) {
		T request = message.body().mapTo(requestClass);
		R response = null;

		try {
			response = method.apply(request);
		} catch (InterruptedException | SuspendExecution e) {
			e.printStackTrace();
		} catch (Throwable e) {
			message.fail(-1, BufferEventBusHandler.getMessage(e));
		}

		message.reply(JsonObject.mapFrom(response));
	}

}
