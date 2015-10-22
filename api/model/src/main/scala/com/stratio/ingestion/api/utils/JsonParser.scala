/**
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.ingestion.api.utils

import com.stratio.ingestion.api.model.commons.{Attribute, Agent}
import spray.json._
import com.stratio.ingestion.api.model.sink.AgentSink
import com.stratio.ingestion.api.model.source.AgentSource
import com.stratio.ingestion.api.model.channel.AgentChannel

/**
 * Created by eruiz on 15/10/15.
 */
object JsonParser extends DefaultJsonProtocol {

  implicit lazy val attributeJsonFormat = jsonFormat6(Attribute)
  implicit lazy val sourceJsonFormat = jsonFormat6(AgentSource)
  implicit lazy val channelJsonFormat = jsonFormat6(AgentChannel)
  implicit lazy val sinkJsonFormat = jsonFormat6(AgentSink)
//  implicit lazy val agentComponentJsonFormat = jsonFormat3(Agent)

}
