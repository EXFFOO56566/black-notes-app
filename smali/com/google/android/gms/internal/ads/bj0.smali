.class public final Lcom/google/android/gms/internal/ads/bj0;
.super Lcom/google/android/gms/internal/ads/r2;
.source ""


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/internal/ads/xe0;

.field private final d:Lcom/google/android/gms/internal/ads/if0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/xe0;Lcom/google/android/gms/internal/ads/if0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/r2;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bj0;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bj0;->c:Lcom/google/android/gms/internal/ads/xe0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bj0;->d:Lcom/google/android/gms/internal/ads/if0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Landroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->c:Lcom/google/android/gms/internal/ads/xe0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/xe0;->c(Landroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->d:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->c:Lcom/google/android/gms/internal/ads/xe0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/xe0;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method public final c()Lb/c/b/a/d/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->d:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->B()Lb/c/b/a/d/a;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->d:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->c:Lcom/google/android/gms/internal/ads/xe0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/xe0;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public final d0()Lcom/google/android/gms/internal/ads/v1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->d:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->C()Lcom/google/android/gms/internal/ads/v1;

    move-result-object v0

    return-object v0
.end method

.method public final destroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->c:Lcom/google/android/gms/internal/ads/xe0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xe0;->a()V

    return-void
.end method

.method public final e()Lcom/google/android/gms/internal/ads/o1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->d:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->A()Lcom/google/android/gms/internal/ads/o1;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->d:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->d:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->f()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final getVideoController()Lcom/google/android/gms/internal/ads/rp2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->d:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->n()Lcom/google/android/gms/internal/ads/rp2;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->d:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->h()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final n()Lb/c/b/a/d/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->c:Lcom/google/android/gms/internal/ads/xe0;

    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v0

    return-object v0
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bj0;->d:Lcom/google/android/gms/internal/ads/if0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/if0;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
