/*
 * MLDX Log Appenders
 * Project hosted at https://github.com/ryanhosp/mldx-log-appenders/
 * Copyright 2012 - 2013 Ho Siaw Ping Ryan
 *    
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.r573.test.mldx.s3.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.r573.mldx.AppenderUtil;

public class RollingFileS3AppenderTest {
	private static Logger log = LoggerFactory.getLogger(RollingFileS3AppenderTest.class);
	
	public static void main(String[] args) {
		for(int i = 0; i < 20000; i++) {
			log.info("Test log content: " + i);
			try {
				Thread.sleep(4);
			}
			catch (InterruptedException e) {
				break;
			}
		}
		AppenderUtil.rollOverAppendersLogBack("com.r573",true);
	}
}
