//package C07ExceptionFileParsing.AuthorException;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.*;
//import java.io.*;
//
//public class C0703JsonParsing1 throws IOException{
//    public static void main(String[] args) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_file.txt");
//        String jasonString = Files.readString(filePath);
//        System.out.println(jasonString);
//
//        // readTree : 트리구조의 JsonNode로 변환
//        // 트리구조의 장점은 유연함
//        JsonNode data1 = objectMapper.readTree(jasonString);
//        Map<String, String> studentMap = new HashMap<>();
//        studentMap.put("id", data1.get("id").asText());
//        studentMap.put("name", data1.get("name").asText());
//        studentMap.put("classNumber", data1.get("classNumber").asText());
//        studentMap.put("city", data1.get("city").asText());
//        System.out.println(studentMap);
//
//        // readValue : 바로 객체로 변환하는 메서드.
//        Map<String, String> studentMap2 = objectMapper.readValue(jasonString, Map.class);
//        Student student3  = objectMapper.readValue(jasonString, Student.class);
//    }
//}
//
//class Student{
//    private int id;
//    private String name;
//    private String classNumber;
//    private String city;
//
//    @Override
//    public String toString(){
//        return "이름은 " + this.name + "\n" + "classNumber는 " + this.classNumber + " \n" + "출신 도시는" + this.city;
//    }
//}
