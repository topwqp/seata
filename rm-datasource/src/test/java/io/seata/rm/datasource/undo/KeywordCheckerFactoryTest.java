/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.rm.datasource.undo;

import io.seata.common.exception.NotSupportYetException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author will
 * @date 2019/9/18
 */
public class KeywordCheckerFactoryTest {

    @Test
    public void testKeywordCheckerFacotry() {
        KeywordCheckerFactory keywordCheckerFactory = new KeywordCheckerFactory();
        Assertions.assertNotNull(keywordCheckerFactory);

        Assertions.assertThrows(NotSupportYetException.class, () -> {
            KeywordCheckerFactory.getKeywordChecker("unknow");
        });
    }
}
