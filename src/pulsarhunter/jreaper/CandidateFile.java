/*
Copyright (C) 2005-2007 Michael Keith, University Of Manchester

email: mkeith@pulsarastronomy.net
www  : www.pulsarastronomy.net/wiki/Software/PulsarHunter

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

*/
/*
 * CandidateFile.java
 *
 * Created on 27 May 2005, 10:23
 */

package pulsarhunter.jreaper;

import java.io.File;
import javax.swing.JFrame;
import pulsarhunter.jreaper.gui.MainView;

/**
 *
 * @author mkeith
 */
public interface CandidateFile extends DeepCloneable<CandidateFile> {
    public JFrame getCandDisplayFrame(Cand c,MainView main);
    public File createImage(Cand c, String path);
    public String getName();
    public File getFile();
    public String getUniqueIdentifier();
    public void precache();
   public void release();
    
}
