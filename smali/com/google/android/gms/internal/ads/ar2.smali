.class public final Lcom/google/android/gms/internal/ads/ar2;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final b:Lcom/google/android/gms/internal/ads/m61;

.field public final c:Lcom/google/android/gms/internal/ads/e3;

.field public d:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/e3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ar2;->d:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ar2;->a:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ar2;->b:Lcom/google/android/gms/internal/ads/m61;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ar2;->c:Lcom/google/android/gms/internal/ads/e3;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/m61;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/internal/ads/m61;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ar2;->d:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ar2;->a:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ar2;->b:Lcom/google/android/gms/internal/ads/m61;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ar2;->c:Lcom/google/android/gms/internal/ads/e3;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/e3;)Lcom/google/android/gms/internal/ads/ar2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ads/e3;",
            ")",
            "Lcom/google/android/gms/internal/ads/ar2<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/ar2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/ar2;-><init>(Lcom/google/android/gms/internal/ads/e3;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/m61;)Lcom/google/android/gms/internal/ads/ar2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/google/android/gms/internal/ads/m61;",
            ")",
            "Lcom/google/android/gms/internal/ads/ar2<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/ar2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/ar2;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/m61;)V

    return-object v0
.end method
