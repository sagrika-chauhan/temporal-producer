//package com.example.temporalproducer.mapper;
//
//
//import com.example.temporalproducer.bookingmodel.Booking;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.mapstruct.factory.Mappers;
//
//
//public class AvroToBookingMapper {private static Singleton single_instance = null;
//
//    // Declaring a variable of type String
//    public String s;
//
//    // Constructor of this class
//    // Here private constructor is used to
//    // restricted to this class itself
//    private Singleton()
//    {
//        s = "Hello I am a string part of Singleton class";
//    }
//
//    // Method
//    // Static method to create instance of Singleton class
//    public static Singleton Singleton()
//    {
//        // To ensure only one instance is created
//        if (single_instance == null) {
//            single_instance = new Singleton();
//        }
//        return single_instance;
//    }
//
//
//    Booking mapToBooking(String domainData) throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.readValue(domainData, Booking.class);
//    }
//}
