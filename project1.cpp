// 2�г� 1�� ���� ���� ��� ���ϱ�

#include <iostream> 
#include <iomanip>
using namespace std;

void average(double Number_of_students, double Total_scores)
{
	double Average = Total_scores / Number_of_students;
	cout << fixed;
	cout.precision(1);
	cout << Average << endl;
}
int main()
{
	double Number_of_students = 10; // �л� ��
	double Total_scores = 90 + 100 + 95 + 60 + 70 + 50 + 20 + 100 + 98 + 100; // �л� ����
	average(Number_of_students, Total_scores);

	return 0;
}