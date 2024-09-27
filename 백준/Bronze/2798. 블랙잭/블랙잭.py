def find_best_blackjack_sum(N, M, cards):
    best_sum = 0  # M을 넘지 않으면서 최대의 합을 저장할 변수

    # 3중 루프를 통해 모든 카드의 조합을 확인
    for i in range(N):
        for j in range(i + 1, N):  # j는 i 다음 카드부터 시작
            for k in range(j + 1, N):  # k는 j 다음 카드부터 시작
                current_sum = cards[i] + cards[j] + cards[k]
                
                # current_sum이 M을 넘지 않으면서 best_sum보다 크면 업데이트
                if current_sum <= M and current_sum > best_sum:
                    best_sum = current_sum
    
    return best_sum

# 입력 받기
N, M = map(int, input().split())
cards = list(map(int, input().split()))

# 결과 출력
print(find_best_blackjack_sum(N, M, cards))