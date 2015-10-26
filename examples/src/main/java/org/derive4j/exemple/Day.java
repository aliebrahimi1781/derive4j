/*
 * Copyright (c) 2015, Jean-Baptiste Giraudeau <jb@giraudeau.info>
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *  * Neither the name of the copyright holder nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.derive4j.exemple;

import org.derive4j.Data;

@Data
public enum Day {

  Sunday {
    @Override
    public <R> R match(Cases<R> cases) {
      return cases.Sunday();
    }
  },
  Monday {
    @Override
    public <R> R match(Cases<R> cases) {
      return cases.Monday();
    }
  },
  Tuesday {
    @Override
    public <R> R match(Cases<R> cases) {
      return cases.Tuesday();
    }
  },
  Wednesday {
    @Override
    public <R> R match(Cases<R> cases) {
      return cases.Wednesday();
    }
  },
  Thursday {
    @Override
    public <R> R match(Cases<R> cases) {
      return cases.Thursday();
    }
  },
  Friday {
    @Override
    public <R> R match(Cases<R> cases) {
      return cases.Friday();
    }
  },
  Saturday {
    @Override
    public <R> R match(Cases<R> cases) {
      return cases.Saturday();
    }
  };

  public abstract <R> R match(Cases<R> cases);

  interface Cases<R> {
    R Sunday();

    R Monday();

    R Tuesday();

    R Wednesday();

    R Thursday();

    R Friday();

    R Saturday();
  }
}
