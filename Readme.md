# Aspect of annotation

AnnotationHandler

```text
@Before: Chạy trước khi method được thực thi
@After: Chạy sau khi method trả về một kết quả
@AfterReturning: Chạy sau khi method trả về một kết quả, lọc lấy kết quả trả về
@AfterThrowing: Chạy khi method xảy ra exception
@Around: Gồm các tất cả các advice trên
@Aspect: Đánh dấu đây là 1 aspect

```

```textmate
    Available role:
    GET http://localhost:8080/get
        execute controller from ExampleController

    Unavailable role:
    GET http://localhost:8080/get2
        execute controller from ExampleController
        
    Available role:
    GET http://localhost:8080/set
        Role: ADMIN
    
    Unavailable role:
    GET http://localhost:8080/set2
        java.lang.Exception: FAIl
```


if we define @Around all annotation @Before, @After or @AfterReturning @AfterThrowing cannot handle

if we define 2 @Around. it will handle with priority