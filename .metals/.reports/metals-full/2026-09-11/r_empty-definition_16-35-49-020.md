error id: file:///C:/Users/user/Downloads/dockerandaction/dockerandaction/src/main/java/com/container/dockerandaction/Api.java:org/springframework/web/bind/annotation/RestController#
file:///C:/Users/user/Downloads/dockerandaction/dockerandaction/src/main/java/com/container/dockerandaction/Api.java
empty definition using pc, found symbol in pc: org/springframework/web/bind/annotation/RestController#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 89
uri: file:///C:/Users/user/Downloads/dockerandaction/dockerandaction/src/main/java/com/container/dockerandaction/Api.java
text:
```scala
package com.container.dockerandaction;

import org.springframework.web.bind.annotation.@@RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class Api {


    @GetMapping
    public String getApi(){
        return "This is the API endpoint";
    }


}

```


#### Short summary: 

empty definition using pc, found symbol in pc: org/springframework/web/bind/annotation/RestController#