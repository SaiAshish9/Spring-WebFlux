<img width="1157" alt="Screenshot 2023-02-23 at 11 37 48 PM" src="https://user-images.githubusercontent.com/43849911/220992627-5887530e-0604-472f-a20b-df4395b0caba.png">

<img width="680" alt="Screenshot 2023-02-23 at 11 39 47 PM" src="https://user-images.githubusercontent.com/43849911/220993024-eae825e9-5ac5-4539-8b58-669a3701c7cf.png">

```
The first step in webflux is to subscribe to the publisher via subscribe() method, then publisher need to call "subscription()" method to connect with Subscriber , subscribe then invoke request(n) method to inform publisher for retrieving n number of data.

We'll later get n number of onNext() methods for n number of method calls.
At the end the onComplete method is triggered. If there's any error, the onError event will be invoked.
```

<img width="1133" alt="Screenshot 2023-02-23 at 11 48 34 PM" src="https://user-images.githubusercontent.com/43849911/220995784-9f5d59a8-38d7-4c4e-b080-8ab2dc3c0996.png">

<img width="1064" alt="Screenshot 2023-02-23 at 11 50 49 PM" src="https://user-images.githubusercontent.com/43849911/220996256-1057c01f-8299-475b-9f81-9496eed90c8b.png">

<img width="971" alt="Screenshot 2023-02-23 at 11 59 15 PM" src="https://user-images.githubusercontent.com/43849911/220997986-5b9dd771-5b35-4b45-9ed1-8632fcd9d37e.png">

<img width="1011" alt="Screenshot 2023-02-24 at 12 00 22 AM" src="https://user-images.githubusercontent.com/43849911/220998195-bf7a2708-fe41-4b51-ad0d-d610e875dcf6.png">

<img width="909" alt="Screenshot 2023-02-24 at 12 03 18 AM" src="https://user-images.githubusercontent.com/43849911/220998858-27105a7f-16df-4974-a821-d1d348e8ead3.png">

<img width="1165" alt="Screenshot 2023-02-24 at 12 06 05 AM" src="https://user-images.githubusercontent.com/43849911/220999473-8e64d2e6-fe2c-4f6e-9306-2701e49981f0.png">
