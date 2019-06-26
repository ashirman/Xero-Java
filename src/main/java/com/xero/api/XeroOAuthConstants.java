package com.xero.api;

/*
 * Copyright (c) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

import com.google.api.client.util.Beta;

/**
 * Constants for Google's OAuth 2.0 implementation.
 *
 * @since 1.7
 * @author Yaniv Inbar
 */
public class XeroOAuthConstants {

  /** Encoded URL of Google's end-user authorization server. */
  public static final String AUTHORIZATION_SERVER_URL = "https://accounts.google.com/o/oauth2/auth";

  /** Encoded URL of Google's token server. */
  public static final String TOKEN_SERVER_URL = "https://identity.xero.com/connect/token";

 
  private XeroOAuthConstants() {
  }
}