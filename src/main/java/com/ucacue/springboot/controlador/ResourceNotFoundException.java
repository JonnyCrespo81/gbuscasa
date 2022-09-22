package com.ucacue.springboot.controlador;

public class ResourceNotFoundException extends RuntimeException {

        public ResourceNotFoundException(String message){
            super(message);
    }
}
