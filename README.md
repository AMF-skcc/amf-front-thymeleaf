Thymeleaf Sample

# 1. 샘플 데모
- 템플릿 적용 버전 : http://localhost:8080/index
<img width="1240" alt="thymeleaf_1" src="https://user-images.githubusercontent.com/62231786/126603139-a8597c6a-6a9b-4d57-9842-f0aa444bafbb.png">

- 템플릿 미적용 버전 : http://localhost:8080/simple/index
<img width="1240" alt="thymeleaf_2" src="https://user-images.githubusercontent.com/62231786/126603160-fe86ec86-974e-4b68-acfb-68bee25c8732.png">

# 2. 패키지 기본 구조
<div class="highlighter-rouge"><div class="highlight"><pre class="highlight"><code>
src/main/
├── java/
│   └── sample/
│       ├── controller/
│       ├── dto/
│       └── service/
│           └── impl/
└── resources/
    ├── static/
    └── templates/
</code></pre></div></div>
   
# 3. 템플릿 적용 방법
## 1. 템플릿 사이트에서 템플릿을 선택한다.
  - https://www.creative-tim.com/templates/free
  - https://startbootstrap.com/templates
## 2. 선택한 템플릿을 다운로드하고 압축을 해제한다. 압축 해제한 파일을 복사한다.
  - static 자원 (css, js 등) : /resources/static/
  - html 파일 : /resources/templates
