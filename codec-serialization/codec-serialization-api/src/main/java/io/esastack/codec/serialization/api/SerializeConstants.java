/*
 * Copyright 2021 OPPO ESA Stack Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.esastack.codec.serialization.api;

public interface SerializeConstants {
    byte HESSIAN2_SERIALIZATION_ID = 2;
    byte JSON_SERIALIZATION_ID = 5;
    byte FASTJSON_SERIALIZATION_ID = 6;
    byte KRYO_SERIALIZATION_ID = 8;
    byte FST_SERIALIZATION_ID = 9;
    byte PROTOSTUFF_SERIALIZATION_ID = 12;
    byte AVRO_SERIALIZATION_ID = 11;
    byte GSON_SERIALIZATION_ID = 16;
    byte PBMIX_SERIALIZATION_ID = 17;

    byte PROTOBUF_SERIALIZATION_ID = 22;
    byte PROTOBUF_SINGLE_SERIALIZATION_ID = 44;
}
