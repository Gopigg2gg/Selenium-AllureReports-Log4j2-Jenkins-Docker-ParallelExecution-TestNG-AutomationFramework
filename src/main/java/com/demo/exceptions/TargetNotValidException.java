/*
 * 
 * Author: Gopinath Angusamy
 * 
 */

package com.demo.exceptions;

@SuppressWarnings("serial")
public class TargetNotValidException extends IllegalStateException {

    public TargetNotValidException(String target) {
        super(String.format("Target %s not supported. Use either local or gird", target));
    }

}
