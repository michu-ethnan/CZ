Automatic Testing
-----

## Getting Started

  ```sh
   # Pull docker-selenium
    docker pull elgalu/selenium

   # Start Selenium Grid
    docker-compose up
   # or 
   # docker-compose up -d
   # to detach containers
   # remember to bring them back down after testing with
   # docker-compose down

   # Run tests with
    clean install verify -Dmaven.test.failure.ignore=true
  ```

## Useful links
* [Dashboard](http://localhost:4444/dashboard), see all the videos and aggregated logs after your tests completed.

* Live preview of your running tests [http://localhost:4444/grid/admin/live](http://localhost:4444/grid/admin/live)

## Report Generated
* inside directory ./target/site/serenity/index.html