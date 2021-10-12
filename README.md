<div id="top"></div>

[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]
[!["Buy Me A Coffee"](https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png)](https://www.buymeacoffee.com/justdvnsh)
[![Patreon][patreon-shield]][patreon-url]
[![Slack][slack-shield]][slack-url]



<!-- PROJECT LOGO -->
<br />
<div align="center">

  <h3 align="center">Two Dimensional Scroll View With Zoom</h3>

  <p align="center">
    An awesome library to include Two Dimensional Scroll view with zooming capabilities in your app.
    <br />
    <a href="https://github.com/othneildrew/Best-README-Template"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/justdvnsh/TwoDScrollableZoomableLayout/issues">Report Bug</a>
    ·
    <a href="https://github.com/justdvnsh/TwoDScrollableZoomableLayout/issues">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

[![Product Name Screen Shot][product-screenshot]](https://example.com)

The project aims to solve a personal problem of including Two Dimensional Scrolling view with zoom. 
A few my projects needed this feature to view the images just like a wallpaper app does to let you set the wallpaper. 
However, the scroll views in the wallpapers simply scroll horizontally. My problem was that a lot of images were loosing their quality if they were set to the phone's height.
I didn't want that. For example, my [AnimeClassroom](https://github.com/justdvnsh/AnimeClassroom) has a manga reading feature. Now the images in mangas are very large both horizontally and vertically. If the height was set to match phone's height, the image lost its quality thus making it harder to read. 
So, I made this Custom view to solve that problem. Now, I have converted this into a library so that it could be used in any project.  

__WARNING! : THIS PROJECT IS STILL IN HEAVY DEVELOPMENT, THEREFORE YOU MAY ENCOUNTER BUGS. You can OPEN the ISSUE on GITHUB REPOSITORY.__

__NEW FEATURES WILL BE ADDED REGULARLY__ 

<p align="right">(<a href="#top">Back to top</a>)</p>


<!-- GETTING STARTED -->
## Getting Started

Simply fork the repo. Clone it into your machine and let AndroidStudio handle the rest.

<!-- Installation -->
## Installation

To include this library, follow the below steps.

Step 1 -> Add this line in  ```root build.gradle``` at the end of repositories.

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Step 2 -> Add this line in your ```module build.gradle``` file.

```
dependencies {
    implementation 'com.github.justdvnsh:TwoDScrollableZoomableLayout:0.0.2'
}
```


See the [open issues](https://github.com/justdvnsh/TwoDScrollableZoomableLayout/issues) for a full list of proposed features (and known issues).

<p align="right">(<a href="#top">Back to top</a>)</p>

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "feature-request".
Don't forget to give the project a star! Thanks again!

__NOTE -> Every PR will be reviewed before merging.__

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

#### PLEASE MAKE SURE TO REMOVE THE .idea/ files before pushing a commit

__Want to support me by buying me a coffee ?__ [!["Buy Me A Coffee"](https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png)](https://www.buymeacoffee.com/justdvnsh)

__Want to contribute to this project by supporting us through money ?__ [![Patreon][patreon-shield]][patreon-url]

__Want to join the discussions ?__ [![Slack][slack-shield]][slack-url]

<p align="right">(<a href="#top">Back to top</a>)</p>

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

Divyansh Dwivedi - [@justdvnsh](https://linkedin.com/in/justdvnsh) - justdvnsh2208@gmail.com

Project Link: [https://github.com/justdvnsh/TwoDScrollableZoomableLayout](https://github.com/justdvnsh/TwoDScrollableZoomableLayout)

Join Discussion at: [![Slack][slack-shield]][slack-url]

<p align="right">(<a href="#top">Back to top</a>)</p>


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/justdvnsh
[product-screenshot]: images/screenshot.png
[patreon-shield]: https://img.shields.io/badge/Patreon-F96854?style=for-the-badge&logo=patreon&logoColor=white
[patreon-url]: https://www.patreon.com/justdvnsh
[slack-shield]: https://img.shields.io/badge/Slack-4A154B?style=for-the-badge&logo=slack&logoColor=white
[slack-url]: https://join.slack.com/t/animeclassroom/shared_invite/zt-wut0t5mp-Y4kF6OGyxLBpyNM0eU6psw