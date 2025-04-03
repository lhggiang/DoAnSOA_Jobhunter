## JOBHUNTER - Tìm Việc Dễ Dàng Và Nhanh Chóng

### Mục Lục
- [1. Giới thiệu dự án](#1-giới-thiệu-dự-án)
- [2. Các chức năng chính](#2-các-chức-năng-chính)
- [3. Công nghệ sử dụng](#3-công-nghệ-sử-dụng)
- [4. Cài đặt và chạy dự án](#4-cài-đặt-và-chạy-dự-án)
- [5. Tác giả](#5-tác-giả)
- [6. Demo chức năng ứng dụng qua Postman](#6-demo-chức-năng-ứng-dụng-qua-postman)
- [7. Hạn chế của ứng dụng](#7-hạn-chế-của-ứng-dụng)

## 1. Giới thiệu dự án
Trong thế giới ngày càng phát triển hiện nay, việc tìm kiếm một công việc phù hợp với kỹ năng và sở thích của bản thân trở nên khó khăn hơn bao giờ hết. Thị trường lao động hiện nay đang thay đổi nhanh chóng với sự xuất hiện của các công nghệ mới, xu hướng làm việc từ xa và yêu cầu ngày càng cao từ các nhà tuyển dụng. Đối với các ứng viên, việc tìm kiếm công việc không chỉ dừng lại ở việc nộp đơn và chờ đợi. Quá trình này đòi hỏi sự kết nối, cập nhật hồ sơ liên tục, và đôi khi là sự kiên nhẫn trong việc ứng tuyển vào hàng loạt công ty. Còn đối với nhà tuyển dụng, việc lựa chọn ứng viên phù hợp cũng không phải là điều dễ dàng. Việc đăng tin tuyển dụng, sàng lọc hồ sơ và quản lý các ứng viên cần một hệ thống chuyên nghiệp, hiệu quả và dễ dàng sử dụng.

**JobHunter** là một ứng dụng tìm việc làm dễ dàng và nhanh chóng, được xây dựng bằng **Spring** cho phần backend, **ReactJS** cho phần frontend và **MySQL** cho cơ sở dữ liệu. Dự án này nhằm giúp người dùng tìm kiếm việc làm nhanh chóng, hiệu quả, đồng thời giúp nhà tuyển dụng dễ dàng đăng tin tuyển dụng và quản lý hồ sơ của ứng viên.

## 2. CÁC CHỨC NĂNG CHÍNH

- **Chức năng đăng ký/đăng nhập/đổi mật khẩu**: Hỗ trợ người dùng tạo tài khoản, đăng nhập nhanh chóng, đổi mật khẩu.
- **Tìm kiếm việc làm**: Cho phép ứng viên tìm việc theo kỹ năng và vị trí việc làm.
- **Ứng tuyển hố sơ**: Ứng viên có thể nộp hồ sơ trực tiếp trên nền tảng mà không cần gửi email hay liên hệ riêng.
- **Quản lý tin tuyển dụng**: Nhà tuyển dụng có thể đăng, chỉnh sửa, và theo dõi tình trạng tin, hồ sơ tuyển dụng của họ.
- **Quản lý hồ sơ cá nhân**: Người tìm việc có thể cập nhật và quản lý hồ sơ cá nhân, xem lịch sử nộp hồ sơ.
- **Thống kê và báo cáo**: Cung cấp các báo cáo và thống kê cho người quản trị, nhà tuyển dụng về tình hình ứng tuyển và hiệu quả của các tin tuyển dụng.
- **Gửi thông báo việc làm qua email**: Khi công việc được tạo phù hợp với level, salary, vị trí thì công việc đó sẽ được gửi qua email tự động cho người dùng.

## 3. CÔNG NGHỆ SỬ DỤNG

- **Build tool**: Gradle
- **Database**: MySQL
 
📌 **Backend**:
- Framework: Spring Boot, Spring Data JPA, Spring Security, Spring REST API
- Authentication: JWT, OAuth2
- API Documentation & Utilities: Swagger, Postman, Lombok

📌 **Frontend**:
- HTML/CSS/JS
- ReactJS

## 4. CÀI ĐẶT VÀ CHẠY DỰ ÁN

### 1. Cài Đặt Backend 
- Cài đặt JDK 17.
- Clone mã nguồn Backend.
- Mở terminal và chạy lệnh: **./gradlew build -x test**.
- Chạy ứng dụng: **./gradlew bootRun**.

### 2. Cài Đặt Frontend  
- Cài đặt môi trường NodeJS.
- Clone mã nguồn Frontend.
- Mở terminal và chạy lệnh: **npm install** để cài các packages, dependenncy.
- Chạy lệnh: **npm run build** để build ứng dụng.
- Chạy lệnh: **npm run preview** để xem ứng dụng chạy trên http://localhost:4173.

### 3. Cấu Hình Cơ Sở Dữ Liệu (MySQL)
- Cài đặt **MySQL**.
- Tạo cơ sở dữ liệu mới: **CREATE DATABASE jobhunter;**
- Chỉnh sửa cấu hình trong application.properties để kết nối với MySQL.

## 5. TÁC GIẢ
- **La Hoàng Giang** - [GitHub](https://github.com/lhggiang)
- **Trần Đặng Mỹ Phương** - [GitHub](https://github.com/lhggiang)
- **Hà Anh Duy** - [GitHub](https://github.com/lhggiang)

## 6. DEMO CHỨC NĂNG ỨNG DỤNG QUA POSTMAN

📌 **USER**:
#### ✅ Đăng ký, đăng nhập

![image](https://github.com/user-attachments/assets/4e878e9a-7ff0-4383-b3fc-1602c5c28cd2)

![image](https://github.com/user-attachments/assets/65d63eba-57ca-4bc3-b0eb-8926b21c6a4d)

#### ✅ Tìm kiếm việc làm theo vị trí và kỹ năng (có thể tìm riêng lẻ hoặc đồng thời 2 tiêu chí)

![image](https://github.com/user-attachments/assets/8012ad7e-cb37-4cd7-ae5b-959e10634344)

![image](https://github.com/user-attachments/assets/b2b0d87a-815e-4ed1-8ccb-980d8e6f512d)

![image](https://github.com/user-attachments/assets/bfc4d5d2-ffaa-43fb-8b58-3dac9d594ec4)

#### ✅ Xem chi tiết công ty, công việc

![image](https://github.com/user-attachments/assets/c5ee05cd-b5fc-4b84-a4db-b48c1605131c)

![image](https://github.com/user-attachments/assets/93bd35c5-6864-475a-a512-79f19fba4b0e)

#### ✅ Xem lịch sử nộp CV, cập nhật thông tin, thay đổi mật khẩu

![image](https://github.com/user-attachments/assets/3e326209-5cdc-4a80-9bab-d40530ae938b)

📌 **ADMIN**:
#### ✅ Trang quản trị (mục dashboard chưa được làm) 

![image](https://github.com/user-attachments/assets/d5bbb140-464d-4ba6-8e33-752695f8eb51)

Trang company (có thể tìm kiếm tên, địa chỉ công ty, thêm, sửa, xóa công ty)

![image](https://github.com/user-attachments/assets/3a9b2af8-57cf-4e18-b401-2462a9b27cbb)

![image](https://github.com/user-attachments/assets/b07b19c5-53b4-4bcd-9314-962ba38dce12)

![image](https://github.com/user-attachments/assets/2760ae01-bb9b-4535-8d64-965c2f0c0693)

Trang user (có thể tìm theo tên, email, thêm, xóa, sửa người dùng)

![image](https://github.com/user-attachments/assets/66ef8187-acd8-4618-aaa9-9cd9fcc7ebeb)

Thêm mới user số 10 (Minh Nguyễn)

![image](https://github.com/user-attachments/assets/c2032fa1-8a42-4d71-b495-37c298985185)

![image](https://github.com/user-attachments/assets/d0fd6b30-6adf-4cad-8b97-6054d15ba85d)

Trang Job (gồm job + skill)

![image](https://github.com/user-attachments/assets/3c1316e8-340c-4d7c-9bb7-1d83dcb85a16)

Trang skill (có thể tạo mới, sửa, xóa, tìm kiếm tên skill)

![image](https://github.com/user-attachments/assets/44a41461-42e6-436f-a377-1f4718449beb)

Trang job (có thể tạo mới, sửa, xóa, tìm kiếm tên, mức lương, level của job)

![image](https://github.com/user-attachments/assets/58f4f21f-c8e4-4390-bb67-afb899d878eb)

Công việc vừa được tạo:

![image](https://github.com/user-attachments/assets/26a5f2f0-840e-4e8f-87a8-d3f66d58008e)

Trang Resume (có thể lọc theo trạng thái hồ sơ + thay đổi trạng thái hồ sơ)

![image](https://github.com/user-attachments/assets/a7e1836a-4c0c-42fa-9fd8-4cc0d2a32da7)

Trạng thái vừa dược chuyển từ REVIEWING  APPROVED

![image](https://github.com/user-attachments/assets/393f7e7d-a7bc-41c1-a0f6-df92180b9ffe)

Trang Permission (có thể tìm kiếm theo tên, API, method, thêm, sửa, xóa permission)

![image](https://github.com/user-attachments/assets/b971b237-8678-4474-913a-5cefbe804c10)

![image](https://github.com/user-attachments/assets/0c84fc7d-6977-493e-8cd1-be4376c1ace5)

Trang Role (có thể tìm theo tên role, thêm xóa, sửa role)

![image](https://github.com/user-attachments/assets/fcac93a6-8d8e-432d-93f0-a60a2f1ce7a3)

Khi Role HR chỉ được phân quyền xem CV

![image](https://github.com/user-attachments/assets/f620fcc2-1a4a-4c74-8c0d-3240321ce966)

Khi truy cập tài khoản với role HR thì giao diện chỉ hiện thị mục Resume

![image](https://github.com/user-attachments/assets/5510b2d9-da18-4d0a-bc8a-d7dc0654f0b3)

## 7. HẠN CHẾ CỦA ỨNG DỤNG
- Chưa có thống kê tổng quan các trạng thái job, resume để trực quan hóa.

