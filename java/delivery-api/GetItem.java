// DocSection: delivery_api_get_item
// Tip: Find more about Java SDK at https://docs.kontent.ai/java
import kentico.kontent.delivery.*;

// Initializes a DeliveryClient
DeliveryClient client = new DeliveryClient("<YOUR_PROJECT_ID>");

// Registers the model class for articles
// Tip: Create strongly typed models according to https://docs.kontent.ai/strongly-typed-models
client.registerType(Article.class);

// Gets an article
CompletionStage<Article> article = client.getItem("my_article", Article.class);
// To use the code for Android projects, see http://docs.kontent.ai/android
// EndDocSection