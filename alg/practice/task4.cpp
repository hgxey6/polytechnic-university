#include <iostream>
#include <vector>

using namespace std;

int main() {
  // ввод	
  int n, copy_n;
  cout << "N = ";
  cin >> n;
 
  copy_n = n;

  int divider = 2; // Начальное значение делителя
  vector<int> list;

  while (n > 1) { // Цикл закончится когда частное от деления станет == 1

    while (n % divider == 0) { // Пока n делится на делитель цикл продолжается
      list.push_back(divider); // записать делитель в список множителей
      n /= divider;            // разделить число на делитель
    }
    divider++; // Перейти к следующему делителю
  }

  // вывод
  cout << copy_n << " = ";
  for (int i = 0; i < list.size() - 1; i++) {
    cout << list[i] << " * ";
  }
  cout << list[list.size() - 1] << endl;

  return 0;
}
