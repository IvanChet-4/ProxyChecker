# ProxyChecker

Программа проверяет работоспособность прокси серверов из файла "ip.txt", а затем записывает рабочие варианты в файл "goods_ip.txt".
Необходим файл "ip.txt" в котором будут записаны ip адреса и номера портов.(в программе указан путь: "C://Users/MTSUser/Desktop/ip.txt" при необходимости его можно изменить) 

Пример содержимого файла "ip.txt":
150.136.246.57	80
43.255.113.232	8082
103.154.153.20	8085
103.169.187.162	3125
89.107.197.165	3128
154.46.40.52	8080
118.97.235.234	8080
117.54.114.101	80
103.122.64.234	3125
203.190.45.90	8080
167.99.139.177	8080
198.49.68.80	80
173.82.149.243	8080
190.61.55.138	999
95.71.39.48	8080
136.243.134.87	80
133.18.227.47 8080

Файл для записи рабочих прокси серверов находиться по прямому пути ("C://Users/MTSUser/Desktop/goods_ip.txt") при необходимости его можно поменять.
Пример содержимого файла "goods_ip.txt":
133.18.227.47:8080
