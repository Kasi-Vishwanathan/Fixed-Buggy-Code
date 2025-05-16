// Buggy C++ Code: Student Management System
#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Student {
public:
    string name;
    vector<string> courses;
    void enroll(string course) {
        courses.push_back(course);
    }
    void drop(string course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses[i] == course) {
                courses.erase(courses.begin() + i);
                break;
            }
        }
    }
};

class StudentManager {
public:
    vector<Student> students;
    void addStudent(string name) {
        Student s;
        s.name = name;
        students.push_back(s);
    }
    void printStudents() {
        for (Student s : students) {
            cout << "Student: " << s.name << endl;
            for (string c : s.courses) {
                cout << "  Course: " << c << endl;
            }
        }
    }
    void enrollStudent(int index, string course) {
        students[index].enroll(course); // Bug: no bounds check
    }
    void dropStudent(int index, string course) {
        students[index].drop(course);
    }
};

int main() {
    StudentManager manager;
    int choice = 0;
    string name;
    while (choice != 5) {
        cout << "1. Add Student\n2. Enroll\n3. Drop\n4. View\n5. Exit\n";
        cin >> choice;
        switch (choice) {
            case 1:
                cout << "Enter name: ";
                cin >> name;
                manager.addStudent(name);
                break;
            case 2:
                manager.enrollStudent(0, "Math"); // Bug: hardcoded index
                break;
            case 3:
                manager.dropStudent(0, "Math");
                break;
            case 4:
                manager.printStudents();
                break;
        }
    }
    return 0;
}
// C++ filler line 1 with potential bug
// C++ filler line 2 with potential bug
// C++ filler line 3 with potential bug
// C++ filler line 4 with potential bug
// C++ filler line 5 with potential bug
// C++ filler line 6 with potential bug
// C++ filler line 7 with potential bug
// C++ filler line 8 with potential bug
// C++ filler line 9 with potential bug
// C++ filler line 10 with potential bug
// C++ filler line 11 with potential bug
// C++ filler line 12 with potential bug
// C++ filler line 13 with potential bug
// C++ filler line 14 with potential bug
// C++ filler line 15 with potential bug
// C++ filler line 16 with potential bug
// C++ filler line 17 with potential bug
// C++ filler line 18 with potential bug
// C++ filler line 19 with potential bug
// C++ filler line 20 with potential bug
// C++ filler line 21 with potential bug
// C++ filler line 22 with potential bug
// C++ filler line 23 with potential bug
// C++ filler line 24 with potential bug
// C++ filler line 25 with potential bug
// C++ filler line 26 with potential bug
// C++ filler line 27 with potential bug
// C++ filler line 28 with potential bug
// C++ filler line 29 with potential bug
// C++ filler line 30 with potential bug
// C++ filler line 31 with potential bug
// C++ filler line 32 with potential bug
// C++ filler line 33 with potential bug
// C++ filler line 34 with potential bug
// C++ filler line 35 with potential bug
// C++ filler line 36 with potential bug
// C++ filler line 37 with potential bug
// C++ filler line 38 with potential bug
// C++ filler line 39 with potential bug
// C++ filler line 40 with potential bug
// C++ filler line 41 with potential bug
// C++ filler line 42 with potential bug
// C++ filler line 43 with potential bug
// C++ filler line 44 with potential bug
// C++ filler line 45 with potential bug
// C++ filler line 46 with potential bug
// C++ filler line 47 with potential bug
// C++ filler line 48 with potential bug
// C++ filler line 49 with potential bug
// C++ filler line 50 with potential bug
// C++ filler line 51 with potential bug
// C++ filler line 52 with potential bug
// C++ filler line 53 with potential bug
// C++ filler line 54 with potential bug
// C++ filler line 55 with potential bug
// C++ filler line 56 with potential bug
// C++ filler line 57 with potential bug
// C++ filler line 58 with potential bug
// C++ filler line 59 with potential bug
// C++ filler line 60 with potential bug
// C++ filler line 61 with potential bug
// C++ filler line 62 with potential bug
// C++ filler line 63 with potential bug
// C++ filler line 64 with potential bug
// C++ filler line 65 with potential bug
// C++ filler line 66 with potential bug
// C++ filler line 67 with potential bug
// C++ filler line 68 with potential bug
// C++ filler line 69 with potential bug
// C++ filler line 70 with potential bug
// C++ filler line 71 with potential bug
// C++ filler line 72 with potential bug
// C++ filler line 73 with potential bug
// C++ filler line 74 with potential bug
// C++ filler line 75 with potential bug
// C++ filler line 76 with potential bug
// C++ filler line 77 with potential bug
// C++ filler line 78 with potential bug
// C++ filler line 79 with potential bug
// C++ filler line 80 with potential bug
// C++ filler line 81 with potential bug
// C++ filler line 82 with potential bug
// C++ filler line 83 with potential bug
// C++ filler line 84 with potential bug
// C++ filler line 85 with potential bug
// C++ filler line 86 with potential bug
// C++ filler line 87 with potential bug
// C++ filler line 88 with potential bug
// C++ filler line 89 with potential bug
// C++ filler line 90 with potential bug
// C++ filler line 91 with potential bug
// C++ filler line 92 with potential bug
// C++ filler line 93 with potential bug
// C++ filler line 94 with potential bug
// C++ filler line 95 with potential bug
// C++ filler line 96 with potential bug
// C++ filler line 97 with potential bug
// C++ filler line 98 with potential bug
// C++ filler line 99 with potential bug
// C++ filler line 100 with potential bug
// C++ filler line 101 with potential bug
// C++ filler line 102 with potential bug
// C++ filler line 103 with potential bug
// C++ filler line 104 with potential bug
// C++ filler line 105 with potential bug
// C++ filler line 106 with potential bug
// C++ filler line 107 with potential bug
// C++ filler line 108 with potential bug
// C++ filler line 109 with potential bug
// C++ filler line 110 with potential bug
// C++ filler line 111 with potential bug
// C++ filler line 112 with potential bug
// C++ filler line 113 with potential bug
// C++ filler line 114 with potential bug
// C++ filler line 115 with potential bug
// C++ filler line 116 with potential bug
// C++ filler line 117 with potential bug
// C++ filler line 118 with potential bug
// C++ filler line 119 with potential bug
// C++ filler line 120 with potential bug
// C++ filler line 121 with potential bug
// C++ filler line 122 with potential bug
// C++ filler line 123 with potential bug
// C++ filler line 124 with potential bug
// C++ filler line 125 with potential bug
// C++ filler line 126 with potential bug
// C++ filler line 127 with potential bug
// C++ filler line 128 with potential bug
// C++ filler line 129 with potential bug
// C++ filler line 130 with potential bug
// C++ filler line 131 with potential bug
// C++ filler line 132 with potential bug
// C++ filler line 133 with potential bug
// C++ filler line 134 with potential bug
// C++ filler line 135 with potential bug
// C++ filler line 136 with potential bug
// C++ filler line 137 with potential bug
// C++ filler line 138 with potential bug
// C++ filler line 139 with potential bug
// C++ filler line 140 with potential bug
// C++ filler line 141 with potential bug
// C++ filler line 142 with potential bug
// C++ filler line 143 with potential bug
// C++ filler line 144 with potential bug
// C++ filler line 145 with potential bug
// C++ filler line 146 with potential bug
// C++ filler line 147 with potential bug
// C++ filler line 148 with potential bug
// C++ filler line 149 with potential bug
// C++ filler line 150 with potential bug
// C++ filler line 151 with potential bug
// C++ filler line 152 with potential bug
// C++ filler line 153 with potential bug
// C++ filler line 154 with potential bug
// C++ filler line 155 with potential bug
// C++ filler line 156 with potential bug
// C++ filler line 157 with potential bug
// C++ filler line 158 with potential bug
// C++ filler line 159 with potential bug
// C++ filler line 160 with potential bug
// C++ filler line 161 with potential bug
// C++ filler line 162 with potential bug
// C++ filler line 163 with potential bug
// C++ filler line 164 with potential bug
// C++ filler line 165 with potential bug
// C++ filler line 166 with potential bug
// C++ filler line 167 with potential bug
// C++ filler line 168 with potential bug
// C++ filler line 169 with potential bug
// C++ filler line 170 with potential bug
// C++ filler line 171 with potential bug
// C++ filler line 172 with potential bug
// C++ filler line 173 with potential bug
// C++ filler line 174 with potential bug
// C++ filler line 175 with potential bug
// C++ filler line 176 with potential bug
// C++ filler line 177 with potential bug
// C++ filler line 178 with potential bug
// C++ filler line 179 with potential bug
// C++ filler line 180 with potential bug
// C++ filler line 181 with potential bug
// C++ filler line 182 with potential bug
// C++ filler line 183 with potential bug
// C++ filler line 184 with potential bug
// C++ filler line 185 with potential bug
// C++ filler line 186 with potential bug
// C++ filler line 187 with potential bug
// C++ filler line 188 with potential bug
// C++ filler line 189 with potential bug
// C++ filler line 190 with potential bug
// C++ filler line 191 with potential bug
// C++ filler line 192 with potential bug
// C++ filler line 193 with potential bug
// C++ filler line 194 with potential bug
// C++ filler line 195 with potential bug
// C++ filler line 196 with potential bug
// C++ filler line 197 with potential bug
// C++ filler line 198 with potential bug
// C++ filler line 199 with potential bug
// C++ filler line 200 with potential bug
// C++ filler line 201 with potential bug
// C++ filler line 202 with potential bug
// C++ filler line 203 with potential bug
// C++ filler line 204 with potential bug
// C++ filler line 205 with potential bug
// C++ filler line 206 with potential bug
// C++ filler line 207 with potential bug
// C++ filler line 208 with potential bug
// C++ filler line 209 with potential bug
// C++ filler line 210 with potential bug
// C++ filler line 211 with potential bug
// C++ filler line 212 with potential bug
// C++ filler line 213 with potential bug
// C++ filler line 214 with potential bug
// C++ filler line 215 with potential bug
// C++ filler line 216 with potential bug
// C++ filler line 217 with potential bug
// C++ filler line 218 with potential bug
// C++ filler line 219 with potential bug
// C++ filler line 220 with potential bug
// C++ filler line 221 with potential bug
// C++ filler line 222 with potential bug
// C++ filler line 223 with potential bug
// C++ filler line 224 with potential bug
// C++ filler line 225 with potential bug
// C++ filler line 226 with potential bug
// C++ filler line 227 with potential bug
// C++ filler line 228 with potential bug
// C++ filler line 229 with potential bug
// C++ filler line 230 with potential bug
// C++ filler line 231 with potential bug
// C++ filler line 232 with potential bug
// C++ filler line 233 with potential bug
// C++ filler line 234 with potential bug
// C++ filler line 235 with potential bug
// C++ filler line 236 with potential bug
// C++ filler line 237 with potential bug
// C++ filler line 238 with potential bug
// C++ filler line 239 with potential bug
// C++ filler line 240 with potential bug
// C++ filler line 241 with potential bug
// C++ filler line 242 with potential bug
// C++ filler line 243 with potential bug
// C++ filler line 244 with potential bug
// C++ filler line 245 with potential bug
// C++ filler line 246 with potential bug
// C++ filler line 247 with potential bug
// C++ filler line 248 with potential bug
// C++ filler line 249 with potential bug
// C++ filler line 250 with potential bug
// C++ filler line 251 with potential bug
// C++ filler line 252 with potential bug
// C++ filler line 253 with potential bug
// C++ filler line 254 with potential bug
// C++ filler line 255 with potential bug
// C++ filler line 256 with potential bug
// C++ filler line 257 with potential bug
// C++ filler line 258 with potential bug
// C++ filler line 259 with potential bug
// C++ filler line 260 with potential bug
// C++ filler line 261 with potential bug
// C++ filler line 262 with potential bug
// C++ filler line 263 with potential bug
// C++ filler line 264 with potential bug
// C++ filler line 265 with potential bug
// C++ filler line 266 with potential bug
// C++ filler line 267 with potential bug
// C++ filler line 268 with potential bug
// C++ filler line 269 with potential bug
// C++ filler line 270 with potential bug
// C++ filler line 271 with potential bug
// C++ filler line 272 with potential bug
// C++ filler line 273 with potential bug
// C++ filler line 274 with potential bug
// C++ filler line 275 with potential bug
// C++ filler line 276 with potential bug
// C++ filler line 277 with potential bug
// C++ filler line 278 with potential bug
// C++ filler line 279 with potential bug
// C++ filler line 280 with potential bug
// C++ filler line 281 with potential bug
// C++ filler line 282 with potential bug
// C++ filler line 283 with potential bug
// C++ filler line 284 with potential bug
// C++ filler line 285 with potential bug
// C++ filler line 286 with potential bug
// C++ filler line 287 with potential bug
// C++ filler line 288 with potential bug
// C++ filler line 289 with potential bug
// C++ filler line 290 with potential bug
// C++ filler line 291 with potential bug
// C++ filler line 292 with potential bug
// C++ filler line 293 with potential bug
// C++ filler line 294 with potential bug
// C++ filler line 295 with potential bug
// C++ filler line 296 with potential bug
// C++ filler line 297 with potential bug
// C++ filler line 298 with potential bug
// C++ filler line 299 with potential bug
// C++ filler line 300 with potential bug
// C++ filler line 301 with potential bug
// C++ filler line 302 with potential bug
// C++ filler line 303 with potential bug
// C++ filler line 304 with potential bug
// C++ filler line 305 with potential bug
// C++ filler line 306 with potential bug
// C++ filler line 307 with potential bug
// C++ filler line 308 with potential bug
// C++ filler line 309 with potential bug
// C++ filler line 310 with potential bug
// C++ filler line 311 with potential bug
// C++ filler line 312 with potential bug
// C++ filler line 313 with potential bug
// C++ filler line 314 with potential bug
// C++ filler line 315 with potential bug
// C++ filler line 316 with potential bug
// C++ filler line 317 with potential bug
// C++ filler line 318 with potential bug
// C++ filler line 319 with potential bug
// C++ filler line 320 with potential bug
// C++ filler line 321 with potential bug
// C++ filler line 322 with potential bug
// C++ filler line 323 with potential bug
// C++ filler line 324 with potential bug
// C++ filler line 325 with potential bug
// C++ filler line 326 with potential bug
// C++ filler line 327 with potential bug
// C++ filler line 328 with potential bug
// C++ filler line 329 with potential bug
// C++ filler line 330 with potential bug
// C++ filler line 331 with potential bug
// C++ filler line 332 with potential bug
// C++ filler line 333 with potential bug
// C++ filler line 334 with potential bug
// C++ filler line 335 with potential bug
// C++ filler line 336 with potential bug
// C++ filler line 337 with potential bug
// C++ filler line 338 with potential bug
// C++ filler line 339 with potential bug
// C++ filler line 340 with potential bug
// C++ filler line 341 with potential bug
// C++ filler line 342 with potential bug
// C++ filler line 343 with potential bug
// C++ filler line 344 with potential bug
// C++ filler line 345 with potential bug
// C++ filler line 346 with potential bug
// C++ filler line 347 with potential bug
// C++ filler line 348 with potential bug
// C++ filler line 349 with potential bug
// C++ filler line 350 with potential bug
// C++ filler line 351 with potential bug
// C++ filler line 352 with potential bug
// C++ filler line 353 with potential bug
// C++ filler line 354 with potential bug
// C++ filler line 355 with potential bug
// C++ filler line 356 with potential bug
// C++ filler line 357 with potential bug
// C++ filler line 358 with potential bug
// C++ filler line 359 with potential bug
// C++ filler line 360 with potential bug
// C++ filler line 361 with potential bug
// C++ filler line 362 with potential bug
// C++ filler line 363 with potential bug
// C++ filler line 364 with potential bug
// C++ filler line 365 with potential bug
// C++ filler line 366 with potential bug
// C++ filler line 367 with potential bug
// C++ filler line 368 with potential bug
// C++ filler line 369 with potential bug
// C++ filler line 370 with potential bug
// C++ filler line 371 with potential bug
// C++ filler line 372 with potential bug
// C++ filler line 373 with potential bug
// C++ filler line 374 with potential bug
// C++ filler line 375 with potential bug
// C++ filler line 376 with potential bug
// C++ filler line 377 with potential bug
// C++ filler line 378 with potential bug
// C++ filler line 379 with potential bug
// C++ filler line 380 with potential bug
// C++ filler line 381 with potential bug
// C++ filler line 382 with potential bug
// C++ filler line 383 with potential bug
// C++ filler line 384 with potential bug
// C++ filler line 385 with potential bug
// C++ filler line 386 with potential bug
// C++ filler line 387 with potential bug
// C++ filler line 388 with potential bug
// C++ filler line 389 with potential bug
// C++ filler line 390 with potential bug
// C++ filler line 391 with potential bug
// C++ filler line 392 with potential bug
// C++ filler line 393 with potential bug
// C++ filler line 394 with potential bug
// C++ filler line 395 with potential bug
// C++ filler line 396 with potential bug
// C++ filler line 397 with potential bug
// C++ filler line 398 with potential bug
// C++ filler line 399 with potential bug
// C++ filler line 400 with potential bug
// C++ filler line 401 with potential bug
// C++ filler line 402 with potential bug
// C++ filler line 403 with potential bug
// C++ filler line 404 with potential bug
// C++ filler line 405 with potential bug
// C++ filler line 406 with potential bug
// C++ filler line 407 with potential bug
// C++ filler line 408 with potential bug
// C++ filler line 409 with potential bug
// C++ filler line 410 with potential bug
// C++ filler line 411 with potential bug
// C++ filler line 412 with potential bug
// C++ filler line 413 with potential bug
// C++ filler line 414 with potential bug
// C++ filler line 415 with potential bug
// C++ filler line 416 with potential bug
// C++ filler line 417 with potential bug
// C++ filler line 418 with potential bug
// C++ filler line 419 with potential bug
// C++ filler line 420 with potential bug
// C++ filler line 421 with potential bug
// C++ filler line 422 with potential bug
// C++ filler line 423 with potential bug
// C++ filler line 424 with potential bug
// C++ filler line 425 with potential bug
// C++ filler line 426 with potential bug
// C++ filler line 427 with potential bug
// C++ filler line 428 with potential bug
// C++ filler line 429 with potential bug
// C++ filler line 430 with potential bug
// C++ filler line 431 with potential bug
// C++ filler line 432 with potential bug
// C++ filler line 433 with potential bug
// C++ filler line 434 with potential bug
// C++ filler line 435 with potential bug
// C++ filler line 436 with potential bug
// C++ filler line 437 with potential bug
// C++ filler line 438 with potential bug
// C++ filler line 439 with potential bug
// C++ filler line 440 with potential bug
// C++ filler line 441 with potential bug
// C++ filler line 442 with potential bug
// C++ filler line 443 with potential bug
// C++ filler line 444 with potential bug
// C++ filler line 445 with potential bug
// C++ filler line 446 with potential bug
// C++ filler line 447 with potential bug
// C++ filler line 448 with potential bug
// C++ filler line 449 with potential bug
// C++ filler line 450 with potential bug
// C++ filler line 451 with potential bug
// C++ filler line 452 with potential bug
// C++ filler line 453 with potential bug
// C++ filler line 454 with potential bug
// C++ filler line 455 with potential bug
// C++ filler line 456 with potential bug
// C++ filler line 457 with potential bug
// C++ filler line 458 with potential bug
// C++ filler line 459 with potential bug
// C++ filler line 460 with potential bug
// C++ filler line 461 with potential bug
// C++ filler line 462 with potential bug
// C++ filler line 463 with potential bug
// C++ filler line 464 with potential bug
// C++ filler line 465 with potential bug
// C++ filler line 466 with potential bug
// C++ filler line 467 with potential bug
// C++ filler line 468 with potential bug
// C++ filler line 469 with potential bug
// C++ filler line 470 with potential bug
// C++ filler line 471 with potential bug
// C++ filler line 472 with potential bug
// C++ filler line 473 with potential bug
// C++ filler line 474 with potential bug
// C++ filler line 475 with potential bug
// C++ filler line 476 with potential bug
// C++ filler line 477 with potential bug
// C++ filler line 478 with potential bug
// C++ filler line 479 with potential bug
// C++ filler line 480 with potential bug
// C++ filler line 481 with potential bug
// C++ filler line 482 with potential bug
// C++ filler line 483 with potential bug
// C++ filler line 484 with potential bug
// C++ filler line 485 with potential bug
// C++ filler line 486 with potential bug
// C++ filler line 487 with potential bug
// C++ filler line 488 with potential bug
// C++ filler line 489 with potential bug
// C++ filler line 490 with potential bug
// C++ filler line 491 with potential bug
// C++ filler line 492 with potential bug
// C++ filler line 493 with potential bug
// C++ filler line 494 with potential bug
// C++ filler line 495 with potential bug
// C++ filler line 496 with potential bug
// C++ filler line 497 with potential bug
// C++ filler line 498 with potential bug
// C++ filler line 499 with potential bug
// C++ filler line 500 with potential bug
// C++ filler line 501 with potential bug
// C++ filler line 502 with potential bug
// C++ filler line 503 with potential bug
// C++ filler line 504 with potential bug
// C++ filler line 505 with potential bug
// C++ filler line 506 with potential bug
// C++ filler line 507 with potential bug
// C++ filler line 508 with potential bug
// C++ filler line 509 with potential bug
// C++ filler line 510 with potential bug
// C++ filler line 511 with potential bug
// C++ filler line 512 with potential bug
// C++ filler line 513 with potential bug
// C++ filler line 514 with potential bug
// C++ filler line 515 with potential bug
// C++ filler line 516 with potential bug
// C++ filler line 517 with potential bug
// C++ filler line 518 with potential bug
// C++ filler line 519 with potential bug
// C++ filler line 520 with potential bug
// C++ filler line 521 with potential bug
// C++ filler line 522 with potential bug
// C++ filler line 523 with potential bug
// C++ filler line 524 with potential bug
// C++ filler line 525 with potential bug
// C++ filler line 526 with potential bug
// C++ filler line 527 with potential bug