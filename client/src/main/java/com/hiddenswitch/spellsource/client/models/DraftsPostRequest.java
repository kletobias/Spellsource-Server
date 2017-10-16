/**
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more
 *
 * OpenAPI spec version: 1.0.1
 * Contact: benjamin.s.berman@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.hiddenswitch.spellsource.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DraftsPostRequest
 */

public class DraftsPostRequest  implements Serializable {
  @SerializedName("startDraft")
  private Boolean startDraft = null;

  @SerializedName("retireEarly")
  private Boolean retireEarly = null;

  public DraftsPostRequest startDraft(Boolean startDraft) {
    this.startDraft = startDraft;
    return this;
  }

   /**
   * Starts a new draft. 
   * @return startDraft
  **/
  @ApiModelProperty(example = "null", value = "Starts a new draft. ")
  public Boolean getStartDraft() {
    return startDraft;
  }

  public void setStartDraft(Boolean startDraft) {
    this.startDraft = startDraft;
  }

  public DraftsPostRequest retireEarly(Boolean retireEarly) {
    this.retireEarly = retireEarly;
    return this;
  }

   /**
   * Retires a draft early. Typically this costs some number of lives. 
   * @return retireEarly
  **/
  @ApiModelProperty(example = "null", value = "Retires a draft early. Typically this costs some number of lives. ")
  public Boolean getRetireEarly() {
    return retireEarly;
  }

  public void setRetireEarly(Boolean retireEarly) {
    this.retireEarly = retireEarly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DraftsPostRequest draftsPostRequest = (DraftsPostRequest) o;
    return Objects.equals(this.startDraft, draftsPostRequest.startDraft) &&
        Objects.equals(this.retireEarly, draftsPostRequest.retireEarly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDraft, retireEarly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftsPostRequest {\n");
    
    sb.append("    startDraft: ").append(toIndentedString(startDraft)).append("\n");
    sb.append("    retireEarly: ").append(toIndentedString(retireEarly)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
