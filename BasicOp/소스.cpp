#include "opencv2/opencv.hpp"
#include <iostream>

using namespace cv;
using namespace std;

void PointOp();
void SizeOp();
void RectOp();
void RotatedRectOp();
void RangeOp();
void StringOp();

int main() {
	//PointOp();
	//SizeOp();
	//RectOp();
	//RotatedRectOp();
	//RangeOp();
	//StringOp();

	return 0;
}

void PointOp() {
	Point pt1;	//pt1 = [0, 0]
	pt1.x = 5; pt1.y = 10;	//pt1 = [5, 10]
	Point pt2(10, 30);	//pt2 = [10, 30]

	Point pt3 = pt1 + pt2;	//pt3 = [15, 40]
	Point pt4 = pt1 * 2;	//pt4 = [10, 20]
	int d1 = pt1.dot(pt2);	//d1 = 350
	bool b1 = (pt1 == pt2);	//b1 = false
	
	cout << "pt1: " << pt1 << endl;
	cout << "pt2: " << pt2 << endl;

	cout << "dot product: " << d1 << endl;
	cout << "cross product: " << pt1.cross(pt2) << endl;
}

void SizeOp() {
	Size sz1, sz2(10, 20);	//sz1 = [0 x 0], sz2 = [10 x 20]
	sz1.width = 5; sz1.height = 10;	//sz1 = [5 x 10]

	Size sz3 = sz1 + sz2;	//sz3 = [15 x 30]
	Size sz4 = sz1 * 2;	//sz4 = [10 x 20]
	int area1 = sz4.area();	//area1 = 200

	cout << "sz3: " << sz3 << endl;
	cout << "sz4: " << sz4 << endl;

	cout << "area(sz4): " << area1 << endl << endl;
}

void RectOp() {
	Rect rc1;	//rc1 = [0 x 0 from (0, 0)]
	Rect rc2(10, 10, 60, 40);	//rc2 = [60 x 40 from (10, 10)]

	Rect rc3 = rc1 + Size(50, 40);	//rc3 = [50 x 40 from (0, 0)]
	Rect rc4 = rc2 + Point(10, 10);	//rc4 = [60 x 40 from (20, 20)]

	Rect rc5 = rc3 & rc4;	//rc5 = [30 x 20 from (20, 20)]
	Rect rc6 = rc3 | rc4;	//rc6 = [80 x 60 from (0, 0)]

	cout << "rc5: " << rc5 << endl;
	cout << "rc6: " << rc6 << endl;

	cout << "rc3: " << rc3 << endl;
	cout << "rc4: " << rc4 << endl;
	//Rect rc7 = rc3 + rc4;	//Error: (Rext_) + (Rect_) is not defined
	/* Note the following from the manual
	rect = rect¡¾point(shifting a rectangle by a certain offset)
	rect = rect¡¾size(expanding or shrinking a rectangle by a certain amount)
	rect += point, rect -= point, rect += size, rect -= size(augmenting operations)
	rect = rect1 & rect2(rectangle intersection)
	rect = rect1 | rect2(minimum area rectangle containing rect1 and rect2)
	rect &= rect1, rect |= rect(and the corresponding augmenting operations)
	rect == rect1, rect != rect1(rectangle comparison)
	*/
}

void RotatedRectOp() {
	RotatedRect rr1(Point2f(40, 30), Size2f(40, 20), 30.f);

	Point2f pts[4];
	rr1.points(pts);

	Rect br = rr1.boundingRect();

	for (int i = 0; i < 4; i++) {
		cout << "pts[" << i << "]: " << pts[i] << endl;
	}
	cout << "br: " << br << endl;
	Rect2f br_f = rr1.boundingRect2f();
	cout << "br_f: " << br_f << endl << endl;
}

void RangeOp() {
	Range r1(0, 10);

	cout << "r1: " << r1 << endl << endl;
}

void StringOp() {
	String str1 = "Hello";
	String str2 = "world";
	String str3 = str1 + " " + str2;	//str3 = "Hello world"

	bool ret = (str2 == "WORLD");

	Mat imgs[3];
	for (int i = 0; i < 3; i++) {
		String filename = format("data%02d.bmp", i + 1);
		cout << filename << endl;
		imgs[i] = imread(filename);
	}

	cout << "str3: " << str3 << endl;
	if (imgs[0].empty()) {
		cout << "data01.bmp: file load failed" << endl;
	}
}
