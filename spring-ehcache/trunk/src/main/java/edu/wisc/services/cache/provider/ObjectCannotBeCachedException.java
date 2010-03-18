/* 
 * Created on Aug 2, 2005
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2005 the original author or authors.
 */
package edu.wisc.services.cache.provider;

import edu.wisc.services.cache.CacheException;

/**
 * <p>
 * Exception thrown when an object cannot be stored in the cache.
 * </p>
 * 
 * @author Alex Ruiz
 */
public class ObjectCannotBeCachedException extends CacheException {

  private static final long serialVersionUID = -9124262814399202014L;

  /**
   * Construct a <code>ObjectCannotBeCachedException</code> with the specified
   * detail message.
   * 
   * @param msg
   *          the detail message
   */
  public ObjectCannotBeCachedException(String msg) {
    super(msg);
  }
}
