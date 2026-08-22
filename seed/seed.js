// seed_students.js
// Usage: node seed_students.js

const fs = require("fs");

const BASE_URL = "http://127.0.0.1:4040/api/post";
const FILE_PATH = "./data.json";

async function main() {
    try {
        // Read JSON file
        const file = fs.readFileSync(FILE_PATH, "utf-8");

        // Convert JSON string to JavaScript object
        const json = JSON.parse(file);

        // Get students array
        const students = json.data;

        if (!Array.isArray(students)) {
            throw new Error("data.json must contain a 'data' array");
        }

        console.log(`Found ${students.length} students.`);
        console.log("Sending students one by one...\n");

        // Send each student
        for (const student of students) {
            try {
                const response = await fetch(BASE_URL, {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json"
                    },
                    body: JSON.stringify({
                        name: student.name,
                        email: student.email,
                        ip: student.ip
                    })
                });

                const responseText = await response.text();

                if (response.ok) {
                    console.log(
                        `✅ Added: ${student.name} (${student.email})`
                    );
                } else {
                    console.log(
                        `❌ Failed: ${student.name} | Status: ${response.status}`
                    );
                    console.log(`   Response: ${responseText}`);
                }

            } catch (error) {
                console.log(
                    `❌ Error for ${student.name}: ${error.message}`
                );
            }
        }

        console.log("\n✅ Done!");

    } catch (error) {
        console.error("❌ Script failed:", error.message);
    }
}

main();