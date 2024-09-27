N = int(input())
numbers = []

# N개의 수 입력 받기
for _ in range(N):
    numbers.append(int(input()))

# 오름차순으로 정렬
numbers.sort()

# 정렬된 결과 출력
for number in numbers:
    print(number)