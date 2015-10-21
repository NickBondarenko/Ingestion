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
package com.stratio.ingestion.api.model.commons

import spray.json.JsonFormat

/**
 * Created by eruiz on 15/10/15.
 */

//trait AttributeValue[T]
//
//object AttributeValueImplicits {
//
//  implicit object IntLikeAttributeValue extends AttributeValue[Int]
//
//  implicit object BooleanLikeAttributeValue extends AttributeValue[Boolean]
//
//  implicit object StringLikeAttributeValue extends AttributeValue[String]
//
//}

case class Attribute[T : JsonFormat](
                      id: String, //fileHeader
                      _type: String, //Find in json (Int,string,boolean)
                      name: String, //UI
                      required: Boolean,//Find in json
                      value: T//Generic 100
                    //TODO Convert in a generic type
                      ) extends Entity
