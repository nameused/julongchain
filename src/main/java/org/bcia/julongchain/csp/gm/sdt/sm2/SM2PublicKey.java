/**
 * Copyright SDT. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bcia.julongchain.csp.gm.sdt.sm2;

import org.bcia.julongchain.csp.gm.sdt.sm3.SM3;

/**
 * GM SM2公钥
 *
 * @author tengxiumin
 * @date 2018/05/16
 * @company SDT
 */
public class SM2PublicKey extends SM2Key {

    private byte[] publicKey;
    private SM3 sm3;

    public SM2PublicKey(byte[] publicKey) {
        this.publicKey = publicKey;
        this.sm3 = new SM3();
    }

    /**
     * 获取SM2公钥数据
     * @return 公钥数据
     */
    @Override
    public byte[] toBytes() {
        return  publicKey;
    }

    /**
     * 获取SM2公钥标识
     * @return 公钥标识
     */
    @Override
    public byte[] ski() {
        try {
            return sm3.hash(publicKey);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 是否为对称密钥
     * @return true/false
     */
    @Override
    public boolean isSymmetric() {
        return false;
    }

    /**
     * 是否为私钥
     * @return true/false
     */
    @Override
    public boolean isPrivate() {
        return false;
    }
}
