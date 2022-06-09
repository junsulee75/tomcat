/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$21 {

    static final FunctionDescriptor SSL_set_accept_state$FUNC = FunctionDescriptor.ofVoid(
        ADDRESS
    );
    static final MethodHandle SSL_set_accept_state$MH = RuntimeHelper.downcallHandle(
        "SSL_set_accept_state",
        constants$21.SSL_set_accept_state$FUNC, false
    );
    static final FunctionDescriptor SSL_get_privatekey$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS
    );
    static final MethodHandle SSL_get_privatekey$MH = RuntimeHelper.downcallHandle(
        "SSL_get_privatekey",
        constants$21.SSL_get_privatekey$FUNC, false
    );
    static final FunctionDescriptor SSL_get_shutdown$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS
    );
    static final MethodHandle SSL_get_shutdown$MH = RuntimeHelper.downcallHandle(
        "SSL_get_shutdown",
        constants$21.SSL_get_shutdown$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_set_default_verify_paths$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS
    );
    static final MethodHandle SSL_CTX_set_default_verify_paths$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_set_default_verify_paths",
        constants$21.SSL_CTX_set_default_verify_paths$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_load_verify_locations$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS,
        ADDRESS,
        ADDRESS
    );
    static final MethodHandle SSL_CTX_load_verify_locations$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_load_verify_locations",
        constants$21.SSL_CTX_load_verify_locations$FUNC, false
    );
    static final FunctionDescriptor SSL_get_session$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS
    );
    static final MethodHandle SSL_get_session$MH = RuntimeHelper.downcallHandle(
        "SSL_get_session",
        constants$21.SSL_get_session$FUNC, false
    );
}

