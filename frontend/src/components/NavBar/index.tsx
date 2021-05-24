import './styles.css';
import Logo from 'assets/img/logo.png'

const NavBar = () => {
    return (
        <div className="color">
            <div className="container">
                <nav className="my-2 my-md-0 mr-md-3">
                    <img src={Logo} alt="Logo" width="50" />
                </nav>
            </div>
        </div>
    );
}

export default NavBar;
