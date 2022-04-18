# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

***
### 기능 구현 목록
* 도메인 설계
  * [x] GameStatus
  * [x] ComputerNumber Random Number 세팅
    * [x] TestCode 구현
  * [x] UserNumber 입력 세팅
    * [x] TestCode 구현
* [x] 입출력화면 구현 (View)
* 게임구현
  * [x] 스트라이크 판단
  * [x] 볼 판단
  * [x] 낫싱 판단
  * [x] 힌트 (판단된 결과) 출력 구현
  * [x] 3스트라이크 시 종료 구현
  * [x] 게임 종료 시 Restart Or End 구현

***
### 제약사항 확인
* [x] Application main()으로 실행
* [x] jdk8 버전 실행
* [x] Randoms, Console API의 경우 missionutils에서 제공되는 것으로 사용
* [x] ApplicationTest 2개의 TestCase 성공 확인
* [x] 컨벤션 확인
* [x] 인덴트 뎁스 1 이하 확인
* [x] stream api 사용불가
* [x] else 사용불가 (swtich도 사용불가)
* [ ] 함수의 크기 10라인 이하로 작성
* [x] 도메인로직에 유닛테스트 구현