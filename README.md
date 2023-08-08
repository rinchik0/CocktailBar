# CocktailBar

Сделать успела очень мало: входной экран считается экраном пустого списка, по кнопке "+"  переходим на экран добавления коктейля.

Экранчики реализованы фрагментами, активити одно, между фрагментами переключаюсь с помощью fragmentManager и navigation

Очень долго пыталась реализовать ViewModel, которая передавала бы данные из AddFragment в ListFragment

Первый экран EmptyListFragment
![image](https://github.com/rinchik0/CocktailBar/assets/106679141/438a0c11-244e-4acd-baf2-62a917ae6acd)

Второй экран AddFragment
![image](https://github.com/rinchik0/CocktailBar/assets/106679141/e12dd125-06a2-4aba-bec2-b5f0f9c33163)

Третий должен был быть списком, но у меня не получилось реализовать Adapter для списка

Я сделала отдельный item списка в виде cardView в cocktail_card_fragment.xml
![image](https://github.com/rinchik0/CocktailBar/assets/106679141/76663451-081e-483f-933c-4f9ad97781a7)
(Если бы там была картинка пользователя, было бы вот так:
![image](https://github.com/rinchik0/CocktailBar/assets/106679141/e986ee1b-7714-4945-b91c-3f449639ad70)
)

navigate:
![image](https://github.com/rinchik0/CocktailBar/assets/106679141/4e81b3c6-be7b-42d7-b763-4b76934b5646)

Была идея реализовать разметку cocktail_card_fragment.xml в виде своего класса View, но так как в android разработке, я относительно новичок, не успела разобраться.

Класс Cocktail хранит в себе модель для коктейлей, класс CocktailRepository представляет модель для хранилища коктейлей.
Класс FragmentViewModel представляет ViewModel, класс CocktailAdapter должен был преобразовывать коктейли из репозитория к виду cocktail_card_fragment, Однако не уложилась по времени.
