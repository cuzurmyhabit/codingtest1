import heapq

def solution(scoville, K):
    heapq.heapify(scoville)
    mixed_count = 0

    while len(scoville) >= 2 and scoville[0] < K:
        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)
        new_scoville = first + second * 2
        heapq.heappush(scoville, new_scoville)
        mixed_count += 1

    return mixed_count if scoville[0] >= K else -1