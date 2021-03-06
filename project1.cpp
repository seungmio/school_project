// 2학년 1반 시험 성적 평균 구하기

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
	double Number_of_students = 10; // 학생 수
	double Total_scores = 90 + 100 + 95 + 60 + 70 + 50 + 20 + 100 + 98 + 100; // 학생 점수
	average(Number_of_students, Total_scores);

	return 0;
}