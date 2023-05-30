def call(String inputVal = 'test') {
    echo "Hi ${inputVal}."
    executeStages();
    echo "Hi stages"
}

def executeStages() {
    checkout();
    build();
    test();
    deploy();
}

def checkout() {
    echo "checking out.."
}


def build() {
    echo "building classess.."
}

def test() {
    echo "testing services.."
}

def deploy() {
    echo "deploying.."
}