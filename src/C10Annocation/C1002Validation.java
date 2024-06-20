package C10Annocation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class C1002Validation {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("hong", "");
        validate(user);
    }
    static void validate(Object object) throws IllegalAccessException {
        Class<?> myClass = object.getClass();
        Field[] fields = myClass.getDeclaredFields();
        for(Field f : fields){
            if(f.isAnnotationPresent(NotEmpty.class)){
                f.setAccessible(true);
                String value = (String)f.get(object);
                if(value == null || value.isEmpty()){
                    NotEmpty notEmpty = f.getAnnotation(NotEmpty.class);
                    throw new IllegalArgumentException(notEmpty.message());
                }
            }
        }
    }
}

class User{
    @NotEmpty(message = "name cannot be empty")
    private String name;
    @NotEmpty(message = "email cannot be empty")
    private String email;

    User(String name, String email){
        this.name = name;
        this.email = email;
    }
}
// 특정 필드의 값이 비어있는지 아닌지 검사하는 어노테이션
@Retention(RetentionPolicy.RUNTIME) // 런타임에 동작하도록 지정한 키워드.
@Target(ElementType.FIELD) // Field : 변수에 적용, Method : 메서드에 적용, Type : 클래스, 인터페이스 등에 적용
@interface NotEmpty{
    String message() default "this field cannot be empty";
}
