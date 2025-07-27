import java.io.FileWriter;
import java.io.IOException;

public class staticPage {
    public static void main(String[] args) {
        String htmlContent = """
           <!DOCTYPE html>
            <html lang="en">
            <head>
              <meta charset="UTF-8" />
              <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
              <title>My Blog</title>
              <style>
                body {
                  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                  margin: 0;
                  background-color: #f8f9fa;
                  color: #333;
                }
            
                header {
                  background-color: #343a40;
                  color: white;
                  padding: 1.5rem 2rem;
                  text-align: center;
                }
            
                .container {
                  max-width: 800px;
                  margin: 2rem auto;
                  padding: 0 1rem;
                }
            
                article {
                  background-color: #ffffff;
                  border-radius: 8px;
                  box-shadow: 0 2px 5px rgba(0,0,0,0.1);
                  padding: 1.5rem;
                  margin-bottom: 2rem;
                }
            
                article h2 {
                  margin-top: 0;
                  color: #007bff;
                }
            
                article p {
                  line-height: 1.6;
                }
            
                footer {
                  text-align: center;
                  padding: 1rem;
                  background-color: #343a40;
                  color: #ccc;
                }
            
                @media (max-width: 600px) {
                  header, .container, footer {
                    padding-left: 1rem;
                    padding-right: 1rem;
                  }
                }
              </style>
            </head>
            <body>
            
              <header>
                <h1>My Simple Blog</h1>
                <p>Thoughts, stories, and ideas</p>
              </header>
            
              <div class="container">
                <article>
                  <h2>🌟 Welcome to My First Blog Post</h2>
                  <p><strong>Date:</strong> July 26, 2025</p>
                  <p>
                    Hello world! This is my first post on my static blog website. I created this page using only HTML and CSS, no JavaScript or frameworks needed. It's fast, simple, and easy to maintain.
                  </p>
                </article>
            
                <article>
                  <h2>💡 Why Static Websites?</h2>
                  <p><strong>Date:</strong> July 25, 2025</p>
                  <p>
                    Static websites are quick to load, easy to deploy, and perfect for personal blogs or portfolios. They don’t require a backend server or database, which makes them cost-effective and secure.
                  </p>
                </article>
            
                <article>
                  <h2>📚 What's Coming Next</h2>
                  <p><strong>Date:</strong> July 24, 2025</p>
                  <p>
                    In future posts, I’ll be sharing tutorials on HTML, CSS, and performance testing tools like JMeter and Katalon. Stay tuned!
                  </p>
                </article>
              </div>
            
              <footer>
                &copy; 2025 My Blog. All rights reserved.
              </footer>
            
            </body>
            </html>
        """;

        try (FileWriter writer = new FileWriter("index.html")) {
            writer.write(htmlContent);
            System.out.println("index.html has been generated.");
        } catch (IOException e) {
        }
    }
}


