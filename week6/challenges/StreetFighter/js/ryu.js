// flag variables
var isHovered = false;
var playSound = false;
var loaded = false;

window.onload = function () {
    var ryu = document.getElementsByClassName("ryu")[0];
    var still = document.getElementsByClassName("ryu-still")[0];
    var ready = document.getElementsByClassName("ryu-ready")[0];
    var throwing = document.getElementsByClassName("ryu-throwing")[0];
    var pose = document.getElementsByClassName("ryu-cool")[0];
    var had = document.getElementsByClassName("hadouken")[0];

    /* 
       The "mouseenter" event is fired at an Element when a 
       pointing device (usually a mouse) is initially moved so that its hotspot 
       is within the element at which the event was fired.
    */
    ryu.addEventListener("mouseenter", function () {
        isHovered = true;
        if (!playSound) {
            still.style.display = 'none';
            ready.style.display = 'block';
        }
    });

    ryu.addEventListener("mouseleave", function () {
        isHovered = false;
        if (!playSound) {
            still.style.display = 'block';
            ready.style.display = 'none';
        }
    });

    ryu.onmousedown = function () {
        if (!playSound) {
            playHadouken();
            ready.style.display = "none";
            throwing.style.display = "block";
            had.style.display = "block";
            had.style.width = '41.188rem';
            had.style.height = '41.188rem';
        }
    };
    
    ryu.onmouseup = function () {
        if (!playSound) {
            //playHadouken();
            ready.style.display = "block";
            throwing.style.display = "none";
            had.style.display = "none";
        }
    }

    document.addEventListener("keydown", function () {

        if (!playSound) {
            playPose();
        }
        // stop rendering these images
        ready.style.display = 'none';
        still.style.display = 'none';
        throwing.style.display = 'none';
        // start rendering the pose
        pose.style.display = 'block';

    });

    document.addEventListener("keyup", function () {
        playPose();
        pose.style.display = 'none';
        if (isHovered === true) {
            ready.style.display = 'block';
        } else {
            still.style.display = 'block';
        }
    });

    function playPose() {
        playSound = !playSound;
        var sound = document.getElementById("pose-sound");
        if (playSound) {
            sound.volume = .2;
            if (!loaded) {
                loaded = true;
                sound.load();
            }
            sound.play();
        } else {
            sound.pause();
        }
    }
    function playHadouken() {
        var sound = document.getElementById("hadouken-sound");
        sound.volume = .2;
        sound.load();
        sound.play();
    }
};
