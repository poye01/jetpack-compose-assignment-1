package com.example.jetpackcomposeassignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.jetpackcomposeassignment1.data.Course
import com.example.jetpackcomposeassignment1.ui.CourseListScreen
import com.example.jetpackcomposeassignment1.ui.OnboardingScreen
import com.example.jetpackcomposeassignment1.ui.theme.JetpackComposeAssignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeAssignment1Theme {
                var showOnboarding by remember { mutableStateOf(true) }
                val courses = listOf(

                    Course(
                        title = "Artificial Intelligence",
                        code = "CS401",
                        creditHours = 4,
                        description = "Gain a deep understanding of AI technologies such as search algorithms, machine learning, neural networks, and natural language processing. This course equips you with the skills to build intelligent systems and apply AI to solve real-world problems.",
                        prerequisites = "CS301 - Mobile App Development: Required to ensure you understand programming basics before diving into AI."
                    ),
                    Course(
                        title = "Web Development",
                        code = "CS305",
                        creditHours = 3,
                        description = "Master both frontend and backend web development. You’ll start with HTML, CSS, and JavaScript, then advance to backend technologies like Node.js and MongoDB, and finally deploy your own dynamic website as a capstone project.",
                        prerequisites = "None: Perfect for those starting their web development journey."
                    ),
                    Course(
                        title = "Data Structures and Algorithms",
                        code = "CS210",
                        creditHours = 4,
                        description = "This essential course covers key data structures such as arrays, linked lists, and trees, and dives deep into algorithms for sorting, searching, and recursion. Prepare to solve complex algorithmic problems and improve your problem-solving skills.",
                        prerequisites = "CS101 - Introduction to Computer Science: A beginner's course in programming and computational thinking."
                    ),
                    Course(
                        title = "Mobile App Development",
                        code = "CS301",
                        creditHours = 3,
                        description = "Learn how to create stunning Android applications with Kotlin and Jetpack Compose. This course covers the basics of UI design, state management, navigation patterns, integrating REST APIs, and testing mobile apps. You’ll leave this course ready to build and deploy professional mobile apps.",
                        prerequisites = "CS201 - Object-Oriented Programming: A foundational course in programming principles."
                    ),
                    Course(
                        title = "Operating Systems",
                        code = "CS310",
                        creditHours = 3,
                        description = "Explore the fundamental concepts of operating systems such as process management, memory management, file systems, and system security. Learn how different OS platforms work and gain hands-on experience writing system-level code.",
                        prerequisites = "CS210 - Data Structures and Algorithms: Builds on the programming foundations learned in CS210."
                    ),
                    Course(
                        title = "Web Development",
                        code = "CS305",
                        creditHours = 3,
                        description = "Master both frontend and backend web development. You’ll start with HTML, CSS, and JavaScript, then advance to backend technologies like Node.js and MongoDB, and finally deploy your own dynamic website as a capstone project.",
                        prerequisites = "None: Perfect for those starting their web development journey."
                    ),
                    Course(
                        title = "Computer Networks",
                        code = "CS306",
                        creditHours = 3,
                        description = "This course will teach you the principles of computer networks, from data transmission to network security. You’ll learn how the internet and other communication systems work and gain the knowledge to design and troubleshoot network systems.",
                        prerequisites = "CS210 - Data Structures and Algorithms: Essential for understanding network protocols and structures."
                    ),
                    Course(
                        title = "Human-Computer Interaction",
                        code = "CS309",
                        creditHours = 2,
                        description = "Explore the principles of human-computer interaction (HCI) and learn how to design intuitive and user-friendly interfaces. This course will help you understand how users interact with technology and how to improve that experience.",
                        prerequisites = "CS210 - Data Structures and Algorithms: A solid understanding of programming is necessary for understanding interface design."
                    )
                )

                if (showOnboarding) {
                    OnboardingScreen(onContinueClicked = { showOnboarding = false })
                } else {
                    CourseListScreen(
                        courseList = courses,
                        onBackClick = { showOnboarding = true }
                    )

                }
            }
        }
    }
}
