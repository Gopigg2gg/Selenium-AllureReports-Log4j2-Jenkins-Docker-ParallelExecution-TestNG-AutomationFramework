 /*
 * 
 * Author: Gopinath Angusamy
 * 
 */

package com.demo.exceptions;

@SuppressWarnings("serial")
public class HeadlessNotSupportedException extends IllegalStateException {

    public HeadlessNotSupportedException(String browser) {
        super(String.format("Headless not supported for %s browser", browser));
    }
}
