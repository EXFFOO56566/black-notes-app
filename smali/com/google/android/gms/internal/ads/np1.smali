.class final Lcom/google/android/gms/internal/ads/np1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<KeyFormatProtoT::",
        "Lcom/google/android/gms/internal/ads/c12;",
        "KeyProtoT::",
        "Lcom/google/android/gms/internal/ads/c12;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/pp1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/pp1<",
            "TKeyFormatProtoT;TKeyProtoT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/pp1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/pp1<",
            "TKeyFormatProtoT;TKeyProtoT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/np1;->a:Lcom/google/android/gms/internal/ads/pp1;

    return-void
.end method


# virtual methods
.method final a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/c12;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/dy1;",
            ")TKeyProtoT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/np1;->a:Lcom/google/android/gms/internal/ads/pp1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/pp1;->a(Lcom/google/android/gms/internal/ads/dy1;)Lcom/google/android/gms/internal/ads/c12;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/np1;->a:Lcom/google/android/gms/internal/ads/pp1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/pp1;->a(Lcom/google/android/gms/internal/ads/c12;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/np1;->a:Lcom/google/android/gms/internal/ads/pp1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/pp1;->b(Lcom/google/android/gms/internal/ads/c12;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/c12;

    return-object p1
.end method
