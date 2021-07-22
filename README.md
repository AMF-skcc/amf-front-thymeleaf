Thymeleaf Sample

# 1. 샘플 데모
- 템플릿 적용 버전 : http://localhost:8080/index
- 템플릿 미적용 버전 : http://localhost:8080/simple/index

# 2. 패키지 기본 구조
├── java/
│   └── sample/
│       ├── controller/
│       ├── dto/
│       └── service/
│           └── impl/
└── resources/
    ├── static/
    └── templates/
    
# 3. 템플릿 적용 방법
## 1. 템플릿 사이트에서 템플릿을 선택한다.
  - https://www.creative-tim.com/templates/free
  - https://startbootstrap.com/templates
## 2. 선택한 템플릿을 다운로드하고 압축을 해제한다. 압축 해제한 파일을 복사한다.
  - static 자원 (css, js 등) : /resources/static/
  - html 파일 : /resources/templates