function solution(n, k) {
    const converted = n.toString(k);
    const parts = converted.split('0');
    let count = 0;

    for (const part of parts) {
        if (part === '') continue; 

        const num = Number(part);
        if (isPrime(num)) {
            count++;
        }
    }

    return count;
}

function isPrime(num) {
    if (num < 2) return false;
    for (let i = 2; i * i <= num; i++) {
        if (num % i === 0) return false;
    }
    return true;
}
