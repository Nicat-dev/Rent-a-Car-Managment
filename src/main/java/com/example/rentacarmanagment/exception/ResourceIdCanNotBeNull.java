package com.example.rentacarmanagment.exception;

public class ResourceIdCanNotBeNull extends RuntimeException{
    public ResourceIdCanNotBeNull(String resource,String field,Object value) {
        super(String.format(" %s with %s => [ %s ] was not found",resource,field,value));
    }
}
