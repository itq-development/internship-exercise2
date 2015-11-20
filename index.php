<?

$g = 'calculator';
require_once('inc/cotemplate.php');
if(!file_exists('inc/'.$g.'.php'))
{
	die('File does not exists');
}
require_once('inc/'.$g.'.php');