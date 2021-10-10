#include "opencv2/opencv.hpp"
#include <iostream>

using namespace cv;
using namespace std;

int main() {
	std::cout << "Hello OpenCV " << CV_VERSION << std::endl;

	Mat img;
	img = imread("lenna.bmp");

	if (img.empty()) {
		cerr << "Image load failed!" << endl;
		return -1;
	}

	namedWindow("image");
	imshow("image", img);

	namedWindow("image2", WINDOW_NORMAL);
	moveWindow("image2", 100, 100);
	imshow("image2", img);

	waitKey();

	return 0;
}