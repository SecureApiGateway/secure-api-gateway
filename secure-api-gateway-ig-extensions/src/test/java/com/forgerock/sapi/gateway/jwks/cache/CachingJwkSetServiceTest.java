/*
 * Copyright © 2020-2025 ForgeRock AS (obst@forgerock.com)
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
package com.forgerock.sapi.gateway.jwks.cache;

import java.net.URI;

import org.forgerock.json.jose.jwk.JWKSet;

/**
 * Test CachingJwkSetService with a HashMapCache as the Cache implementation.
 */
public class CachingJwkSetServiceTest extends BaseCachingJwkSetServiceTest {
    @Override
    protected Cache<URI, JWKSet> createSimpleCache() {
        return new HashMapCache<>();
    }
}
