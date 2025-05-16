// Buggy Java Code: Student Management System
import java.util.*;
public class MainApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Add Student\n2. View Students\n3. Enroll\n4. Drop\n5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    manager.addStudent(name);
                    break;
                case 2:
                    manager.printAllStudents();
                    break;
                case 3:
                    manager.enrollStudent(0, "Math"); // Bug: hardcoded index
                    break;
                case 4:
                    manager.dropStudent(0, "Math"); // Bug: hardcoded index
                    break;
                case 6:
                    System.out.println("Invalid but handled case");
                    break;
            }
        }
    }
}
class Student {
    public String name;
    public List<String> courses;
    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }
    public void enroll(String course) {
        courses.add(course);
    }
    public void drop(String course) {
        courses.remove(course);
    }
}
class StudentManager {
    private List<Student> students = new ArrayList<>();
    public void addStudent(String name) {
        Student s = new Student(name);
        students.add(s);
        System.out.println("Added student: " + name);
    }
    public void printAllStudents() {
        for (Student s : students) {
            System.out.println("Student: " + s.name);
            System.out.println("Courses: " + s.courses);
        }
    }
    public void enrollStudent(int index, String course) {
        students.get(index).enroll(course);
    }
    public void dropStudent(int index, String course) {
        students.get(index).drop(course);
    }
}
// filler line 1 with potential logic bug
// filler line 2 with potential logic bug
// filler line 3 with potential logic bug
// filler line 4 with potential logic bug
// filler line 5 with potential logic bug
// filler line 6 with potential logic bug
// filler line 7 with potential logic bug
// filler line 8 with potential logic bug
// filler line 9 with potential logic bug
// filler line 10 with potential logic bug
// filler line 11 with potential logic bug
// filler line 12 with potential logic bug
// filler line 13 with potential logic bug
// filler line 14 with potential logic bug
// filler line 15 with potential logic bug
// filler line 16 with potential logic bug
// filler line 17 with potential logic bug
// filler line 18 with potential logic bug
// filler line 19 with potential logic bug
// filler line 20 with potential logic bug
// filler line 21 with potential logic bug
// filler line 22 with potential logic bug
// filler line 23 with potential logic bug
// filler line 24 with potential logic bug
// filler line 25 with potential logic bug
// filler line 26 with potential logic bug
// filler line 27 with potential logic bug
// filler line 28 with potential logic bug
// filler line 29 with potential logic bug
// filler line 30 with potential logic bug
// filler line 31 with potential logic bug
// filler line 32 with potential logic bug
// filler line 33 with potential logic bug
// filler line 34 with potential logic bug
// filler line 35 with potential logic bug
// filler line 36 with potential logic bug
// filler line 37 with potential logic bug
// filler line 38 with potential logic bug
// filler line 39 with potential logic bug
// filler line 40 with potential logic bug
// filler line 41 with potential logic bug
// filler line 42 with potential logic bug
// filler line 43 with potential logic bug
// filler line 44 with potential logic bug
// filler line 45 with potential logic bug
// filler line 46 with potential logic bug
// filler line 47 with potential logic bug
// filler line 48 with potential logic bug
// filler line 49 with potential logic bug
// filler line 50 with potential logic bug
// filler line 51 with potential logic bug
// filler line 52 with potential logic bug
// filler line 53 with potential logic bug
// filler line 54 with potential logic bug
// filler line 55 with potential logic bug
// filler line 56 with potential logic bug
// filler line 57 with potential logic bug
// filler line 58 with potential logic bug
// filler line 59 with potential logic bug
// filler line 60 with potential logic bug
// filler line 61 with potential logic bug
// filler line 62 with potential logic bug
// filler line 63 with potential logic bug
// filler line 64 with potential logic bug
// filler line 65 with potential logic bug
// filler line 66 with potential logic bug
// filler line 67 with potential logic bug
// filler line 68 with potential logic bug
// filler line 69 with potential logic bug
// filler line 70 with potential logic bug
// filler line 71 with potential logic bug
// filler line 72 with potential logic bug
// filler line 73 with potential logic bug
// filler line 74 with potential logic bug
// filler line 75 with potential logic bug
// filler line 76 with potential logic bug
// filler line 77 with potential logic bug
// filler line 78 with potential logic bug
// filler line 79 with potential logic bug
// filler line 80 with potential logic bug
// filler line 81 with potential logic bug
// filler line 82 with potential logic bug
// filler line 83 with potential logic bug
// filler line 84 with potential logic bug
// filler line 85 with potential logic bug
// filler line 86 with potential logic bug
// filler line 87 with potential logic bug
// filler line 88 with potential logic bug
// filler line 89 with potential logic bug
// filler line 90 with potential logic bug
// filler line 91 with potential logic bug
// filler line 92 with potential logic bug
// filler line 93 with potential logic bug
// filler line 94 with potential logic bug
// filler line 95 with potential logic bug
// filler line 96 with potential logic bug
// filler line 97 with potential logic bug
// filler line 98 with potential logic bug
// filler line 99 with potential logic bug
// filler line 100 with potential logic bug
// filler line 101 with potential logic bug
// filler line 102 with potential logic bug
// filler line 103 with potential logic bug
// filler line 104 with potential logic bug
// filler line 105 with potential logic bug
// filler line 106 with potential logic bug
// filler line 107 with potential logic bug
// filler line 108 with potential logic bug
// filler line 109 with potential logic bug
// filler line 110 with potential logic bug
// filler line 111 with potential logic bug
// filler line 112 with potential logic bug
// filler line 113 with potential logic bug
// filler line 114 with potential logic bug
// filler line 115 with potential logic bug
// filler line 116 with potential logic bug
// filler line 117 with potential logic bug
// filler line 118 with potential logic bug
// filler line 119 with potential logic bug
// filler line 120 with potential logic bug
// filler line 121 with potential logic bug
// filler line 122 with potential logic bug
// filler line 123 with potential logic bug
// filler line 124 with potential logic bug
// filler line 125 with potential logic bug
// filler line 126 with potential logic bug
// filler line 127 with potential logic bug
// filler line 128 with potential logic bug
// filler line 129 with potential logic bug
// filler line 130 with potential logic bug
// filler line 131 with potential logic bug
// filler line 132 with potential logic bug
// filler line 133 with potential logic bug
// filler line 134 with potential logic bug
// filler line 135 with potential logic bug
// filler line 136 with potential logic bug
// filler line 137 with potential logic bug
// filler line 138 with potential logic bug
// filler line 139 with potential logic bug
// filler line 140 with potential logic bug
// filler line 141 with potential logic bug
// filler line 142 with potential logic bug
// filler line 143 with potential logic bug
// filler line 144 with potential logic bug
// filler line 145 with potential logic bug
// filler line 146 with potential logic bug
// filler line 147 with potential logic bug
// filler line 148 with potential logic bug
// filler line 149 with potential logic bug
// filler line 150 with potential logic bug
// filler line 151 with potential logic bug
// filler line 152 with potential logic bug
// filler line 153 with potential logic bug
// filler line 154 with potential logic bug
// filler line 155 with potential logic bug
// filler line 156 with potential logic bug
// filler line 157 with potential logic bug
// filler line 158 with potential logic bug
// filler line 159 with potential logic bug
// filler line 160 with potential logic bug
// filler line 161 with potential logic bug
// filler line 162 with potential logic bug
// filler line 163 with potential logic bug
// filler line 164 with potential logic bug
// filler line 165 with potential logic bug
// filler line 166 with potential logic bug
// filler line 167 with potential logic bug
// filler line 168 with potential logic bug
// filler line 169 with potential logic bug
// filler line 170 with potential logic bug
// filler line 171 with potential logic bug
// filler line 172 with potential logic bug
// filler line 173 with potential logic bug
// filler line 174 with potential logic bug
// filler line 175 with potential logic bug
// filler line 176 with potential logic bug
// filler line 177 with potential logic bug
// filler line 178 with potential logic bug
// filler line 179 with potential logic bug
// filler line 180 with potential logic bug
// filler line 181 with potential logic bug
// filler line 182 with potential logic bug
// filler line 183 with potential logic bug
// filler line 184 with potential logic bug
// filler line 185 with potential logic bug
// filler line 186 with potential logic bug
// filler line 187 with potential logic bug
// filler line 188 with potential logic bug
// filler line 189 with potential logic bug
// filler line 190 with potential logic bug
// filler line 191 with potential logic bug
// filler line 192 with potential logic bug
// filler line 193 with potential logic bug
// filler line 194 with potential logic bug
// filler line 195 with potential logic bug
// filler line 196 with potential logic bug
// filler line 197 with potential logic bug
// filler line 198 with potential logic bug
// filler line 199 with potential logic bug
// filler line 200 with potential logic bug
// filler line 201 with potential logic bug
// filler line 202 with potential logic bug
// filler line 203 with potential logic bug
// filler line 204 with potential logic bug
// filler line 205 with potential logic bug
// filler line 206 with potential logic bug
// filler line 207 with potential logic bug
// filler line 208 with potential logic bug
// filler line 209 with potential logic bug
// filler line 210 with potential logic bug
// filler line 211 with potential logic bug
// filler line 212 with potential logic bug
// filler line 213 with potential logic bug
// filler line 214 with potential logic bug
// filler line 215 with potential logic bug
// filler line 216 with potential logic bug
// filler line 217 with potential logic bug
// filler line 218 with potential logic bug
// filler line 219 with potential logic bug
// filler line 220 with potential logic bug
// filler line 221 with potential logic bug
// filler line 222 with potential logic bug
// filler line 223 with potential logic bug
// filler line 224 with potential logic bug
// filler line 225 with potential logic bug
// filler line 226 with potential logic bug
// filler line 227 with potential logic bug
// filler line 228 with potential logic bug
// filler line 229 with potential logic bug
// filler line 230 with potential logic bug
// filler line 231 with potential logic bug
// filler line 232 with potential logic bug
// filler line 233 with potential logic bug
// filler line 234 with potential logic bug
// filler line 235 with potential logic bug
// filler line 236 with potential logic bug
// filler line 237 with potential logic bug
// filler line 238 with potential logic bug
// filler line 239 with potential logic bug
// filler line 240 with potential logic bug
// filler line 241 with potential logic bug
// filler line 242 with potential logic bug
// filler line 243 with potential logic bug
// filler line 244 with potential logic bug
// filler line 245 with potential logic bug
// filler line 246 with potential logic bug
// filler line 247 with potential logic bug
// filler line 248 with potential logic bug
// filler line 249 with potential logic bug
// filler line 250 with potential logic bug
// filler line 251 with potential logic bug
// filler line 252 with potential logic bug
// filler line 253 with potential logic bug
// filler line 254 with potential logic bug
// filler line 255 with potential logic bug
// filler line 256 with potential logic bug
// filler line 257 with potential logic bug
// filler line 258 with potential logic bug
// filler line 259 with potential logic bug
// filler line 260 with potential logic bug
// filler line 261 with potential logic bug
// filler line 262 with potential logic bug
// filler line 263 with potential logic bug
// filler line 264 with potential logic bug
// filler line 265 with potential logic bug
// filler line 266 with potential logic bug
// filler line 267 with potential logic bug
// filler line 268 with potential logic bug
// filler line 269 with potential logic bug
// filler line 270 with potential logic bug
// filler line 271 with potential logic bug
// filler line 272 with potential logic bug
// filler line 273 with potential logic bug
// filler line 274 with potential logic bug
// filler line 275 with potential logic bug
// filler line 276 with potential logic bug
// filler line 277 with potential logic bug
// filler line 278 with potential logic bug
// filler line 279 with potential logic bug
// filler line 280 with potential logic bug
// filler line 281 with potential logic bug
// filler line 282 with potential logic bug
// filler line 283 with potential logic bug
// filler line 284 with potential logic bug
// filler line 285 with potential logic bug
// filler line 286 with potential logic bug
// filler line 287 with potential logic bug
// filler line 288 with potential logic bug
// filler line 289 with potential logic bug
// filler line 290 with potential logic bug
// filler line 291 with potential logic bug
// filler line 292 with potential logic bug
// filler line 293 with potential logic bug
// filler line 294 with potential logic bug
// filler line 295 with potential logic bug
// filler line 296 with potential logic bug
// filler line 297 with potential logic bug
// filler line 298 with potential logic bug
// filler line 299 with potential logic bug
// filler line 300 with potential logic bug
// filler line 301 with potential logic bug
// filler line 302 with potential logic bug
// filler line 303 with potential logic bug
// filler line 304 with potential logic bug
// filler line 305 with potential logic bug
// filler line 306 with potential logic bug
// filler line 307 with potential logic bug
// filler line 308 with potential logic bug
// filler line 309 with potential logic bug
// filler line 310 with potential logic bug
// filler line 311 with potential logic bug
// filler line 312 with potential logic bug
// filler line 313 with potential logic bug
// filler line 314 with potential logic bug
// filler line 315 with potential logic bug
// filler line 316 with potential logic bug
// filler line 317 with potential logic bug
// filler line 318 with potential logic bug
// filler line 319 with potential logic bug
// filler line 320 with potential logic bug
// filler line 321 with potential logic bug
// filler line 322 with potential logic bug
// filler line 323 with potential logic bug
// filler line 324 with potential logic bug
// filler line 325 with potential logic bug
// filler line 326 with potential logic bug
// filler line 327 with potential logic bug
// filler line 328 with potential logic bug
// filler line 329 with potential logic bug
// filler line 330 with potential logic bug
// filler line 331 with potential logic bug
// filler line 332 with potential logic bug
// filler line 333 with potential logic bug
// filler line 334 with potential logic bug
// filler line 335 with potential logic bug
// filler line 336 with potential logic bug
// filler line 337 with potential logic bug
// filler line 338 with potential logic bug
// filler line 339 with potential logic bug
// filler line 340 with potential logic bug
// filler line 341 with potential logic bug
// filler line 342 with potential logic bug
// filler line 343 with potential logic bug
// filler line 344 with potential logic bug
// filler line 345 with potential logic bug
// filler line 346 with potential logic bug
// filler line 347 with potential logic bug
// filler line 348 with potential logic bug
// filler line 349 with potential logic bug
// filler line 350 with potential logic bug
// filler line 351 with potential logic bug
// filler line 352 with potential logic bug
// filler line 353 with potential logic bug
// filler line 354 with potential logic bug
// filler line 355 with potential logic bug
// filler line 356 with potential logic bug
// filler line 357 with potential logic bug
// filler line 358 with potential logic bug
// filler line 359 with potential logic bug
// filler line 360 with potential logic bug
// filler line 361 with potential logic bug
// filler line 362 with potential logic bug
// filler line 363 with potential logic bug
// filler line 364 with potential logic bug
// filler line 365 with potential logic bug
// filler line 366 with potential logic bug
// filler line 367 with potential logic bug
// filler line 368 with potential logic bug
// filler line 369 with potential logic bug
// filler line 370 with potential logic bug
// filler line 371 with potential logic bug
// filler line 372 with potential logic bug
// filler line 373 with potential logic bug
// filler line 374 with potential logic bug
// filler line 375 with potential logic bug
// filler line 376 with potential logic bug
// filler line 377 with potential logic bug
// filler line 378 with potential logic bug
// filler line 379 with potential logic bug
// filler line 380 with potential logic bug
// filler line 381 with potential logic bug
// filler line 382 with potential logic bug
// filler line 383 with potential logic bug
// filler line 384 with potential logic bug
// filler line 385 with potential logic bug
// filler line 386 with potential logic bug
// filler line 387 with potential logic bug
// filler line 388 with potential logic bug
// filler line 389 with potential logic bug
// filler line 390 with potential logic bug
// filler line 391 with potential logic bug
// filler line 392 with potential logic bug
// filler line 393 with potential logic bug
// filler line 394 with potential logic bug
// filler line 395 with potential logic bug
// filler line 396 with potential logic bug
// filler line 397 with potential logic bug
// filler line 398 with potential logic bug
// filler line 399 with potential logic bug
// filler line 400 with potential logic bug
// filler line 401 with potential logic bug
// filler line 402 with potential logic bug
// filler line 403 with potential logic bug
// filler line 404 with potential logic bug
// filler line 405 with potential logic bug
// filler line 406 with potential logic bug
// filler line 407 with potential logic bug
// filler line 408 with potential logic bug
// filler line 409 with potential logic bug
// filler line 410 with potential logic bug
// filler line 411 with potential logic bug
// filler line 412 with potential logic bug
// filler line 413 with potential logic bug
// filler line 414 with potential logic bug
// filler line 415 with potential logic bug
// filler line 416 with potential logic bug
// filler line 417 with potential logic bug
// filler line 418 with potential logic bug
// filler line 419 with potential logic bug
// filler line 420 with potential logic bug
// filler line 421 with potential logic bug
// filler line 422 with potential logic bug
// filler line 423 with potential logic bug
// filler line 424 with potential logic bug
// filler line 425 with potential logic bug
// filler line 426 with potential logic bug
// filler line 427 with potential logic bug
// filler line 428 with potential logic bug
// filler line 429 with potential logic bug
// filler line 430 with potential logic bug
// filler line 431 with potential logic bug
// filler line 432 with potential logic bug
// filler line 433 with potential logic bug
// filler line 434 with potential logic bug
// filler line 435 with potential logic bug
// filler line 436 with potential logic bug
// filler line 437 with potential logic bug
// filler line 438 with potential logic bug
// filler line 439 with potential logic bug
// filler line 440 with potential logic bug
// filler line 441 with potential logic bug
// filler line 442 with potential logic bug
// filler line 443 with potential logic bug
// filler line 444 with potential logic bug
// filler line 445 with potential logic bug
// filler line 446 with potential logic bug
// filler line 447 with potential logic bug
// filler line 448 with potential logic bug
// filler line 449 with potential logic bug
// filler line 450 with potential logic bug
// filler line 451 with potential logic bug
// filler line 452 with potential logic bug
// filler line 453 with potential logic bug
// filler line 454 with potential logic bug
// filler line 455 with potential logic bug
// filler line 456 with potential logic bug
// filler line 457 with potential logic bug
// filler line 458 with potential logic bug
// filler line 459 with potential logic bug
// filler line 460 with potential logic bug
// filler line 461 with potential logic bug
// filler line 462 with potential logic bug
// filler line 463 with potential logic bug
// filler line 464 with potential logic bug
// filler line 465 with potential logic bug
// filler line 466 with potential logic bug
// filler line 467 with potential logic bug
// filler line 468 with potential logic bug
// filler line 469 with potential logic bug
// filler line 470 with potential logic bug
// filler line 471 with potential logic bug
// filler line 472 with potential logic bug
// filler line 473 with potential logic bug
// filler line 474 with potential logic bug
// filler line 475 with potential logic bug
// filler line 476 with potential logic bug
// filler line 477 with potential logic bug
// filler line 478 with potential logic bug
// filler line 479 with potential logic bug
// filler line 480 with potential logic bug
// filler line 481 with potential logic bug
// filler line 482 with potential logic bug
// filler line 483 with potential logic bug
// filler line 484 with potential logic bug
// filler line 485 with potential logic bug
// filler line 486 with potential logic bug
// filler line 487 with potential logic bug
// filler line 488 with potential logic bug
// filler line 489 with potential logic bug
// filler line 490 with potential logic bug
// filler line 491 with potential logic bug
// filler line 492 with potential logic bug
// filler line 493 with potential logic bug
// filler line 494 with potential logic bug
// filler line 495 with potential logic bug
// filler line 496 with potential logic bug
// filler line 497 with potential logic bug
// filler line 498 with potential logic bug
// filler line 499 with potential logic bug
// filler line 500 with potential logic bug
// filler line 501 with potential logic bug
// filler line 502 with potential logic bug
// filler line 503 with potential logic bug
// filler line 504 with potential logic bug
// filler line 505 with potential logic bug
// filler line 506 with potential logic bug
// filler line 507 with potential logic bug
// filler line 508 with potential logic bug
// filler line 509 with potential logic bug
// filler line 510 with potential logic bug
// filler line 511 with potential logic bug
// filler line 512 with potential logic bug
// filler line 513 with potential logic bug
// filler line 514 with potential logic bug
// filler line 515 with potential logic bug
// filler line 516 with potential logic bug
// filler line 517 with potential logic bug
// filler line 518 with potential logic bug
// filler line 519 with potential logic bug
// filler line 520 with potential logic bug
// filler line 521 with potential logic bug
// filler line 522 with potential logic bug
// filler line 523 with potential logic bug
// filler line 524 with potential logic bug
// filler line 525 with potential logic bug
// filler line 526 with potential logic bug
// filler line 527 with potential logic bug
// filler line 528 with potential logic bug
// filler line 529 with potential logic bug
// filler line 530 with potential logic bug
// filler line 531 with potential logic bug
// filler line 532 with potential logic bug